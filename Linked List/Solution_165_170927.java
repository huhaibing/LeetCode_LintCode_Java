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
}