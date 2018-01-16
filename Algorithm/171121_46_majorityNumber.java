/**
主元素
*/

public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
	 
	// Solution 1: map，时间空间均为O(n).
	// Solution 2: 抵消法。
	 public int majorityNumber(List<Integer> nums) {
        // write your code here
		int count = 1, candidate = nums.get(0);
		for (int i=1; i<nums.size(); i++) {
			System.out.println(candidate + ": " + count);
			if (nums.get(i) == candidate)
				count++;
			else
				count--;
			if (count == 0) {
				candidate = nums.get(i);
				count = 1;
			}
		}
		return candidate;
    }
     
     //时间复杂度为O(n)，空间复杂度为O(n)
    public int majorityNumber(List<Integer> nums) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<nums.size(); i++) {
			int temp = nums.get(i);
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
			if (map.get(temp) > nums.size() / 2)
			    return temp;
		}
		return 0;
	}
}