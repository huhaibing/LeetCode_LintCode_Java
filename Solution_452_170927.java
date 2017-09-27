/*
删除链表中等于给定值val的所有节点。
Example:
给出链表 1->2->3->3->4->5->3, 和 val = 3, 你需要返回删除3之后的链表：1->2->4->5。
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
     * @param val: An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        ListNode firstnode = new ListNode(0);
        firstnode.next = head;
        head = firstnode;   //此处可以理解为新的一个链表，将firstnode作为头，而head作为链表中的指针
        
        while (head.next != null) {
            if (head.next.val == val){
                head.next = head.next.next; //因为删除一个，不用移动指针，画图就能理解
            } else {
                head = head.next;
            }
        }
        return firstnode.next;
    }
}