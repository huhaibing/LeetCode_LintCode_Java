/**
173. 链表插入排序 
用插入排序对链表排序

样例
Given 1->3->2->0->null, return 0->1->2->3->null
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
     * @param head: The first node of linked list.
     * @return: The head of linked list.
     */
    public ListNode insertionSortList(ListNode head) {
        // write your code here
        if (head == null)
            return null;
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        head = prehead;
        while (head.next != null) {
            ListNode loc = prehead;
            while(head.next.val >= loc.next.val && head != loc)
                loc = loc.next;
            if (loc == head)
                head = head.next;
            else {
                ListNode temp = head.next;
                head.next = temp.next;
                temp.next = loc.next;
                loc.next = temp;
            }
        }
        return prehead.next;
    }
}