/*
给定一个排序数组，在原数组中删除重复出现的数字，使得每个元素只出现一次，并且返回新的数组的长度。
不要使用额外的数组空间，必须在原地没有额外空间的条件下完成。

给出数组A =[1,1,2]，你的函数应该返回长度2，此时A=[1,2]。
*/

public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
		List<Integer> dnums = new ArrayList<>();
		for (int n : nums) {
			if (!dnums.contains(n))
				dnums.add(n);
		}
		for (int i=0; i<dnums.size(); i++) {
			nums[i] = dnums.get(i);
		}
		return dnums.size();
	}
    
    
}