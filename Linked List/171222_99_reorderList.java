/**
99. 重排链表 
给定一个单链表L: L0→L1→…→Ln-1→Ln,
重新排列后为：L0→Ln→L1→Ln-1→L2→Ln-2→…
必须在不改变节点值的情况下进行原地操作。

样例
给出链表 1->2->3->4->null，重新排列后为1->4->2->3->null。
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
     * @param head: The head of linked list.
     * @return: nothing
     */
    public void reorderList(ListNode head) {
        // write your code here
        if (head==null || head.next==null || head.next.next==null)
            return ;
        ListNode slow = head;
        ListNode fast = head;
        // 快慢指针得到链表中间位置
        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next != null)
            fast = fast.next;
        // 将后半段倒序排列
        while (slow.next != fast) {
            ListNode temp = slow.next;
            slow.next = temp.next;
            temp.next =fast.next;
            fast.next =temp;
        }
        ListNode h = head;
        // 后半段插入前半段合并
        while (h!=slow && slow.next!=null) {
            ListNode temp = slow.next;
            slow.next = slow.next.next;
            temp.next = h.next;
            h.next = temp;
            h = h.next.next;
        }
    }
}