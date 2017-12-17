/**
221. 链表求和II 
假定用一个链表表示两个数，其中每个节点仅包含一个数字。假设这两个数的数字顺序排列，请设计一种方法将两个数相加，并将其结果表现为链表的形式。

样例
给出 6->1->7 + 2->9->5。即，617 + 295。
返回 9->1->2。即，912 。
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
     * @param l1: The first list.
     * @param l2: The second list.
     * @return: the sum list of l1 and l2.
     */
    public ListNode addLists2(ListNode l1, ListNode l2) {
        // write your code here
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode prehead = new ListNode(-1);
        int flag = 0;
        while (!stack1.empty() || !stack2.empty()){
            int sum = flag;
            if (!stack1.empty()) {
                sum += stack1.pop();
            }
            if (!stack2.empty()) {
                sum += stack2.pop();
            }
            flag = sum / 10;
            ListNode temp = new ListNode(sum % 10);
            temp.next = prehead.next;
            prehead.next = temp;
        }
        if (flag == 1) {
            prehead.val = 1;
            return prehead;
        } else {
            return prehead.next;
        }
    }
}