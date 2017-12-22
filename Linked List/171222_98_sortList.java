/**
98. 链表排序 
在 O(n log n) 时间复杂度和常数级的空间复杂度下给链表排序。

样例
给出 1->3->2->null，给它排序变成 1->2->3->null.
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
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
            return head;
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode temp = slow;
        while (fast!=null && fast.next!=null) {
            fast = fast.next.next;
            temp = slow;
            slow = slow.next;
        }
        temp.next = null;   // 如果不截断，则遍历!=null条件不成立
        System.out.println(head.val + " " + slow.val);
        return mergeSort(sortList(head), sortList(slow));
    }
    public ListNode mergeSort(ListNode head1, ListNode head2) {
        if (head1 == null && head2 == null)
            return null;
        ListNode prehead = new ListNode(-1);
        ListNode temp = prehead;
        while (head1!=null || head2!=null) {
            if (head1 == null) {
                temp.next = head2;
                head2 = head2.next;
            } else if (head2 == null) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                if (head1.val <= head2.val) {
                    temp.next = head1;
                    head1 = head1.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                }
            }
            temp = temp.next;
        }
        return prehead.next;
    }
}