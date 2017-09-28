/*
给一个链表，两两交换其中的节点，然后返回交换后的链表。
样例
给出 1->2->3->4, 你应该返回的链表是 2->1->4->3。
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


public class Solution {
    /*
     * @param head: a ListNode
     * @return: a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preh = dummy;
        
        if (head == null || head.next == null)  //尾节点的处理
            return head;
        else {
            preh.next = head.next; 
            head.next = swapPairs(preh.next.next);  //递归
            preh.next.next = head;
        }
        return dummy.next;
    }
}