/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param l1: ListNode l1 is the head of the linked list
     * @param l2: ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
	 
	 /*==========方法一：基本插入==========*/
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode head = new ListNode(0);
        head.next = l2;
        l2 = head;
        
        while(l1 != null){
            
            l2 = head;  //将l2归位到头
            ListNode temp = new ListNode(0);
            
            /*比较寻找l2应插入的位置，并记录应插入的上一个位置temp*/
            while (l2 != null && l2.val <= l1.val){
                temp = l2;
                l2 = l2.next;
            }
            
            /*l1中的node插入到l2中必须先记录l1临时位置templ1，后移动l1*/
            ListNode templ1 = new ListNode(0);
            templ1 = l1;
            l1 = l1.next;
            temp.next = templ1;
            templ1.next = l2;
        }
        return head.next;
    }
	
	/*==========方法二：递归==========*/
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        /*l1空，返回l2；l2空，返回l1*/
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        else {
            if (l1.val <= l2.val){
                head.next = l1;
                head = head.next;
                head.next = mergeTwoLists(l1.next, l2); //递归
            } else {
                head.next = l2;
                head = head.next;
                head.next = mergeTwoLists(l1, l2.next);
            }
        }
        return dummy.next;
    }
}