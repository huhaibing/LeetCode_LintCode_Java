/*
给定一个排序的整数数组（升序）和一个要查找的整数target，用O(logn)的时间查找到target第一次出现的下标（从0开始），如果target不存在于数组中，返回-1。

*/
public class Solution {
	
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
	 
	 /*使用三个指针，分别指向头、尾、待比较的中间位置。
	   注意：指针修改时并不是直接改为middle。*/
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int low = 0;
        int high = nums.length-1;
        int middle;
        while (low <= high){
        	middle  = (low + high)/2;
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                high = middle-1;	//因为middle已经比较过，所以不是 high = middle
            } else if (target > nums[middle]){
                low = middle+1;		//同理，不是low = middle
            } 
        }
        return -1;
    }
    
}
