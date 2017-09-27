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
        // write your code here
        int flag = 0;
        ListNode l3 = new ListNode(0);
        ListNode headl3 = l3;   //和链表的头指针
        while (l1!=null && l2!=null) {
            int sum = l1.val + l2.val + flag;
            flag = sum / 10;    //是否需要进位
            
            ListNode snode = new ListNode(0);   //在和链表中添加新节点
            snode.val = sum % 10;
            l3.next = snode;
            
            l1 = l1.next;   //指针移动
            l2 = l2.next;
            l3 = l3.next;
        }
        while (l1==null && l2!=null){
            int sum =l2.val + flag;
            flag = sum / 10;
            
            ListNode snode = new ListNode(0);
            snode.val = sum % 10;
            l3.next = snode;
            
            l2 = l2.next;
            l3 = l3.next;
        }
        while (l1!=null && l2==null){
            int sum =l1.val + flag;
            flag = sum / 10;
            
            ListNode snode = new ListNode(0);
            snode.val = sum % 10;
            l3.next = snode;
            
            l1 = l1.next;
            l3 = l3.next;
        }
        //存在最高位进1的情况
        if (flag == 1){
            ListNode snode = new ListNode(0);
            snode.val = 1;
            l3.next = snode;
        }
        return headl3.next;
    }
}