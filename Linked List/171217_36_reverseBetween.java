/**
36. 翻转链表 II 
翻转链表中第m个节点到第n个节点的部分

 注意事项
m，n满足1 ≤ m ≤ n ≤ 链表长度

样例
给出链表1->2->3->4->5->null， m = 2 和n = 4，返回1->4->3->2->5->null
*/

/**
 * Definition for ListNode
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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        ListNode prehead = new ListNode(-1);
        prehead.next = head;
        head = prehead;
        int i = 0;
        ListNode start = head;
        Stack<Integer> stack = new Stack<Integer>();    //记录需要翻转的点
        while (i <= n) {
            if (i == m-1)
                start = head;
            if (i >= m) //压栈
                stack.push(head.val);
            i++;
            head = head.next;
        }
        start = start.next;
        //栈弹出，修改链表中的值
        while (!stack.empty()) {
            System.out.println(stack.peek());
            start.val = stack.pop();
            start = start.next;
        }
        return prehead.next;
    }
}