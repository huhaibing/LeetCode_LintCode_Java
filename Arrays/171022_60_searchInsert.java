/*
给定一个排序数组和一个目标值，如果在数组中找到目标值则返回索引。如果没有，返回到它将会被按顺序插入的位置。
你可以假设在数组中无重复元素。

样例
[1,3,5,6]，5 → 2

[1,3,5,6]，2 → 1

[1,3,5,6]， 7 → 4

[1,3,5,6]，0 → 0
*/

public class Solution {
    /*
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: An integer
     */
    public int searchInsert(int[] A, int target) {
		int i=0;
		if (A.length == 0 || A == null)
			return 0;
		while (i < A.length) {
			if (target <= A[i]) {
//				System.out.println("Found!" + i);
				return i;
			}
			else
				i++;
		}
		return i;
	}
}