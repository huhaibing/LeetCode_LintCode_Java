/**
主元素
*/

public class Solution {
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
     
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