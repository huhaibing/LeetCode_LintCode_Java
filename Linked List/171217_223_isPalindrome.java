/**
223. 回文链表 
设计一种方式检查一个链表是否为回文链表。

样例
1->2->1 就是一个回文链表。
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
     * @param head: A ListNode.
     * @return: A boolean.
     */
    public boolean isPalindrome(ListNode head) {
        // write your code here
        if (head == null || head.next == null)
            return true;
        ListNode temp = new ListNode(-1);
        temp.next = head;
        int num = 0;
        // 链表的长度
        while (temp.next != null) {
            num ++;
            temp = temp.next;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        // 前半部分入栈
        while (j < num/2) {
            stack.push(head.val);
            head = head.next;
            j++;
        }
        if (num % 2 != 0) { //长度为奇数，跳过中间node
            head = head.next;
        }
        while (j < num-(num%2)) {   //循环判断时候注意长度
            if (stack.peek() != head.val) { //不等则false
                return false;
            } else {    //相等则出栈
                stack.pop();
                if (stack.empty() && head.next == null)
                    return true;
                head = head.next;
            }
            j++;
        }
        if (stack.empty())
            return true;
        return false;
    }
}