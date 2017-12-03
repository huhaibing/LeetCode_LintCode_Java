/**
82. 落单的数 
给出2*n + 1 个的数字，除其中一个数字之外其他每个数字均出现两次，找到这个数字。
样例
给出 [1,2,2,1,3,4,3]，返回 4
*/

public class Solution {
    /*
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumber(int[] A) {
        // write your code here
        if (A.length == 0)
            return 0;
        List<Integer> ans = new ArrayList<Integer>();
        for (int i=0; i<A.length; i++) {
            if (ans.contains(A[i])) {
            	ans.remove(new Integer(A[i]));
            } else {
            	ans.add(A[i]);
            }
        }
        return ans.get(0);
    }
}