/**
380. 两个链表的交叉 
请写一个程序，找到两个单链表最开始的交叉节点。

 注意事项
如果两个链表没有交叉，返回null。
在返回结果后，两个链表仍须保持原有的结构。
可假定整个链表结构中没有循环。
样例
下列两个链表：
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
在节点 c1 开始交叉。
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
     * @param headA: the first list
     * @param headB: the second list
     * @return: a ListNode
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // write your code here
        if (headA==null || headB==null)
            return null;
        if (headA == headB)
            return headA;
        // 将链表A收尾相连
        ListNode fast = headA;
        int lenA = 1;
        while (fast.next != null) {
            fast = fast.next;
            lenA++;
        }
        ListNode end = fast;
        end.next = headA;
        fast = headB;
        ListNode slow = headB;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            // 设定快指针比慢指针正好快一圈的速度（即A的长度），从B开始的slow若等于fast，则是交叉点
            if (fast == slow) {
                System.out.println("Intersected.");
                fast = headB;
                slow = headB;
                int i=0;
                while (i < lenA) {
                    fast = fast.next;
                    i++;
                }
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        end.next = null;
        return null;
    }
}