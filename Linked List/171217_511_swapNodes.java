/**
511. 交换链表当中两个节点 
给你一个链表以及两个权值v1和v2，交换链表中权值为v1和v2的这两个节点。保证链表中节点权值各不相同，如果没有找到对应节点，那么什么也不用做。

 注意事项
你需要交换两个节点而不是改变节点的权值

样例
给出链表 1->2->3->4->null ，以及 v1 = 2 ， v2 = 4
返回结果 1->4->3->2->null。
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
     * @param v1: An integer
     * @param v2: An integer
     * @return: a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        head = prehead;
        ListNode temp1 = new ListNode(-1);  //记录要交换的点
        ListNode temp2 = new ListNode(-1);
        while (head.next != null) {
            if (head.next.val == v1) {
                temp1 = head;
            } else if (head.next.val == v2) {
                temp2 = head;
            }
            head = head.next;
        }
        if (temp1.next == null || temp2.next == null) { //没有找到交换的点
            return prehead.next;
        }
        //交换指针太过复杂，直接交换值
        int temp = temp1.next.val;
        temp1.next.val = temp2.next.val;
        temp2.next.val = temp;
        return prehead.next;
    }
}