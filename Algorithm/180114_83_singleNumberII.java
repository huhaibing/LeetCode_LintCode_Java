/**
83. 落单的数 II 
给出3*n + 1 个的数字，除其中一个数字之外其他每个数字均出现三次，找到这个数字。

样例
给出 [1,1,2,3,3,3,2,2,4,1] ，返回 4
*/

import java.util.Map.Entry;
public class Solution {
    /*
     * @param A: An integer array
     * @return: An integer
     */
    public int singleNumberII(int[] A) {
        // write your code here
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<A.length; i++) {
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			} else {
				map.put(A[i], 1);
			}
		}
		for (Entry<Integer, Integer> iter : map.entrySet()) {
			if (iter.getValue() != 3)
				return iter.getKey();
		}
		return -1;
    }
}