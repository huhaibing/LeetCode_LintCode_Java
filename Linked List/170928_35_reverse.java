/*
翻转一个链表
样例
给出一个链表1->2->3->null，这个翻转后的链表为3->2->1->null
*/

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
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        // write your code here
        ListNode preh = new ListNode(0);
        preh.next = head;
        ListNode dummy = new ListNode(0);
        
        while(head != null){
            /*删除head点*/
            preh.next = head.next;
            
            /*head插入到dummy后面*/
            head.next = dummy.next;
            dummy.next = head;
            
            /*移动指针*/
            head = preh.next;
        }
        return dummy.next;
    }
}