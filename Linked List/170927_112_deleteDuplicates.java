/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode preh = dummy;
        while(head != null){
            if (head.val == preh.val){
                /*删除重复点*/
                preh.next = head.next;
                head = preh.next;
            } else {
                preh = head;
                head = head.next;
            }
        }
        return dummy.next;
    }
}