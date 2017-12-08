/*
给定一个旋转排序数组，在原地恢复其排序。

说明
什么是旋转数组？
比如，原始数组为[1,2,3,4], 则其旋转数组可以是[1,2,3,4], [2,3,4,1], [3,4,1,2], [4,1,2,3]
*/

public class Solution {
    /*
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(List<Integer> nums) {
		int i=0;
		while (i < nums.size()-1 && nums.get(i) <= nums.get(i+1))
			i++;
		if (i < nums.size()) {
			List<Integer> temp = nums.subList(0, i+1);
			nums.addAll(temp);
			while (i >= 0) {
				nums.remove(0);
				i--;
			}
		}
	}
}