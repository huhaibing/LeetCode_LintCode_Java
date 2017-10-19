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
	/*------方法一------*/
	public int removeDuplicates(int[] nums) {
		int i=0;
		if (nums.length == 0)
			return 0;
		for (int j=0; j<nums.length; j++) {
			if (nums[j] != nums[i])
				nums[++i] = nums[j];
		}
		System.out.println(Arrays.toString(nums));
		return i+1;
	}
	
	// /*------方法二------*/
    // public int removeDuplicates(int[] nums) {
		// List<Integer> dnums = new ArrayList<>();
		// for (int n : nums) {
			// if (!dnums.contains(n))
				// dnums.add(n);
		// }
		// for (int i=0; i<dnums.size(); i++) {
			// nums[i] = dnums.get(i);
		// }
		// return dnums.size();
	// }
	
	
}