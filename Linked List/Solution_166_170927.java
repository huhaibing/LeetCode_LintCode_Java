/*
找到单链表倒数第n个节点，保证链表中节点的最少数量为n。
Example:
给出链表 3->2->1->5->null和n = 2，返回倒数第二个节点的值1.
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
     * @param n: An integer
     * @return: Nth to last node of a singly linked list. 
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        int i = 0;
        ListNode p = new ListNode(0);
        p = head;
        while(head != null){
            i++;    //i用来记录两个指针之间的差距
            /*当i达到两个指针的间距时，记录倒数位置的指针才开始移动*/
            if (i > n){
                p = p.next;
            }
            head = head.next;
        }
        return p;
    }
}