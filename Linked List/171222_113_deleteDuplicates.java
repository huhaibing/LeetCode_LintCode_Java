/**
113. 删除排序链表中的重复数字 II 
给定一个排序链表，删除所有重复的元素只留下原链表中没有重复的元素。

样例
给出 1->2->3->3->4->4->5->null，返回 1->2->5->null
给出 1->1->1->2->3->null，返回 2->3->null
*/

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
     * @return: head of the linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
            return head;
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        head = prehead;
        while (head.next != null && head.next.next != null) {
            int flag = 0;
            while (head.next.next != null && head.next.val == head.next.next.val) {
                head.next.next = head.next.next.next;
                flag = 1;
            }
            if (flag == 1) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return prehead.next;
    }
}