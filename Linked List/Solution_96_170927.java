/*
给定一个单链表和数值x，划分链表使得所有小于x的节点排在大于等于x的节点之前。
你应该保留两部分内链表节点原有的相对顺序。
Example：
给定链表 1->4->3->2->5->2->null，并且 x=3
返回 1->2->2->4->3->5->null
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
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        ListNode h = new ListNode(0);
        h.next = head;
        head = h;
        
        ListNode temp = new ListNode(0);
        temp = head;    //记录排序的分隔位置
        h = h.next; //记录正比较的位置
        ListNode preh = new ListNode(0);
        preh = head;    //记录待删除的位置
        while(h != null){
            if (h.val < x){
                /*删除小于x的节点*/
                preh.next = h.next;
                
                /*将删除的节点插入temp位置*/
                h.next = temp.next;
                temp.next = h;
                
                temp = temp.next;
            }
            preh = h;
            h = preh.next;
        }
        return head.next;
    }
}