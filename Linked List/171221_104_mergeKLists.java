/**
104. 合并k个排序链表 
合并k个排序链表，并且返回合并后的排序链表。尝试分析和描述其复杂度。

样例
给出3个排序链表[2->4->null,null,-1->null]，返回 -1->2->4->null
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
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
        if (lists.size() == 0)
            return null;
        if (lists.size() == 1)
            return lists.get(0);
        ListNode merge = new ListNode(-1);
        merge.next = lists.get(0);
        for (int i=1; i<lists.size(); i++) {
            ListNode temp = lists.get(i);
            ListNode head = merge;
            while (temp!=null) {
                while(head.next!=null && temp.val>head.next.val) {
                    head = head.next;
                }
                // temp比merge链表的所有值都大
                if (head.next == null) {
                    head.next = temp;
                    break;
                } else {
                    // 插入操作
                    ListNode t = temp.next;
                    temp.next = head.next;
                    head.next = temp;
                    temp = t;
                }
            }
        }
        return merge.next;
    }
}
