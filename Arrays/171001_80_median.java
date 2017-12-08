public class Solution {
    /*
     * @param nums: A list of integers
     * @return: An integer denotes the middle number of the array
     */
    public int median(int[] nums) {
        // write your code here
        int[] sortNums = quickSort(nums, 0, nums.length-1);
        return nums[(nums.length-1)/2];
    }
    
    public int[] quickSort(int[] nums, int start, int end) {
		int i=start, j=end;
		int key = nums[start];
		while (i != j) {
			while (nums[j] >= key && i<j) {
				j--;
			}
			nums[i] = nums[j];
			while (nums[i] <= key && i<j) {
				i++;
			}
			nums[j] = nums[i];
		}
		nums[i] = key;
		if (i-1 > start)
			quickSort(nums, start, i-1);
		if (j+1 < end)
			quickSort(nums, j+1, end);
		return nums;
	}
}