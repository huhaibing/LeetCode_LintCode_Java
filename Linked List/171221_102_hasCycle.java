/**
102. 带环链表 
给定一个链表，判断它是否有环。

样例
给出 -21->10->4->5, tail connects to node index 1，返回 true
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
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
            return false;
        ListNode fast = head;
        ListNode late = head;
        while (fast.next!=null && fast.next.next!=null) {   //如果不判定.next是否为空，则会出现空指针错误
            fast = fast.next.next;
            late = late.next;
            if (fast == late)
                return true;
        }
        return false;
    }
}