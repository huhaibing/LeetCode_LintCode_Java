/**
170. 旋转链表 
给定一个链表，旋转链表，使得每个节点向右移动k个位置，其中k是一个非负数

样例
给出链表1->2->3->4->5->null和k=2
返回4->5->1->2->3->null
*/

/**
 * Definition for singly-linked list.
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
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null)
            return null;
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        int p = 0;
        while (p < k) {
            if (head.next == null) {    //k比链表长度长，则回到头节点
                head = prehead.next;
            } else {
               head = head.next; 
            }
            p++;
        }
        ListNode tail = prehead.next;   //待切割的点前面的点，tail + 待切割点
        while (head.next != null) {
            head = head.next;
            tail = tail.next;
        }
        //切割片段放在前面
        head.next = prehead.next;
        prehead.next = tail.next;
        tail.next = null;
        return prehead.next;
    }
}