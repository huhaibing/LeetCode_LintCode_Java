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
     * @param head: The first node of linked list.
     * @param n: An integer
     * @return: The head of linked list.
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preh = dummy;
        int i=0;
        while(head != null){
            i++;
            /*指针的移动*/
            if (i > n){
                preh = preh.next;
            }
            head = head.next;
        }
        /*删除操作*/
        preh.next = preh.next.next;
        return dummy.next;
    }
}