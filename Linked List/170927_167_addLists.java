/*
你有两个用链表代表的整数，其中每个节点包含一个数字。数字存储按照在原来整数中相反的顺序，使得第一个数字位于链表的开头。写出一个函数将两个整数相加，用链表形式返回和。
Example:
给出两个链表 3->1->5->null 和 5->9->2->null，返回 8->0->8->null
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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        int sum = 0;
        
        /*
         * 三种基本情况：空、不空；不空、空；不空、不空
         * 易忽略进位：空、空、进位
         */
        while (l1 != null || l2 != null || sum != 0){
            if (l1 != null) {   //用==判断则情况太多，反向思考
                sum += l1.val;
                l1 = l1.next;
            } 
            if (l2 != null) {   //此处不是else if，为了顺序执行
                sum += l2.val;
                l2 = l2.next;
            }
            p.next = new ListNode(sum % 10);    //声明节点的方式，代码简洁
            sum = sum / 10; //sum可以在轮转中记录上次的进位情况
            p = p.next;
        }
        return dummy.next;
    }
}