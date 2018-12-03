class Solution {
	public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        int len = nums.length;
        int l = 0;
        int r = len-1;
        int m = l+(r-l)/2;
        
        if (nums[0] < nums[len-1])
        	return binSearch(nums, 0, len-1, target);
        while (l < r-1) {
            if (nums[l] > nums[m]) {
                r = m;
            } else if (nums[m] > nums[r]) {
                l = m;
            }
            m = l+(r-l)/2;
        }
        l = (nums[m]<nums[r] ? m : r);
        
        if (nums[len-1]>=target) {
            return binSearch(nums, l, len-1, target);
        } else if (nums[len-1]<target) {
            return binSearch(nums, 0, l, target);
        }
        return -1;
    }
    public int binSearch(int[] nums, int l, int r, int target) {
        int m = l + (r-l)/2;
        while (l<r-1) {
            m = l+(r-l)/2;
            if (nums[m] == target)
                return m;
            else if (nums[m]<target) {
                l = m;
            } else if (nums[m]>target) {
                r = m;
            }
        }
        
        if (nums[l] == target)
            return l;
        if (nums[r] == target)
            return r;
        return -1;
    }
}