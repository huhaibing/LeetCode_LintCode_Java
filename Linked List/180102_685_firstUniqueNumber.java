/**
685. 数据流中第一个唯一的数字 
给一个连续的数据流,写一个函数返回终止数字到达时的第一个唯一数字（包括终止数字）,如果在终止数字前无唯一数字或者找不到这个终止数字, 返回 -1.

样例
给一个数据流 [1, 2, 2, 1, 3, 4, 4, 5, 6] 以及一个数字 5, 返回 3
给一个数据流 [1, 2, 2, 1, 3, 4, 4, 5, 6] 以及一个数字 7, 返回 -1
*/

public class Solution {
    /*
     * @param : a continuous stream of numbers
     * @param : a number
     * @return: returns the first unique number
     */
    public int firstUniqueNumber(int[] nums, int number) {
        // Write your code here
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> tl = new ArrayList<Integer>();
		if (nums.length == 0)
			return -1;
		int i = 0;
		while (i < nums.length) {
			int temp = nums[i];
			if (!tl.contains(temp)) {
				if (!list.contains(temp))
					list.add(temp);
				else {
				    list.remove(Integer.valueOf(temp));
					tl.add(temp);
				}
			}
			if (temp == number) {
				if (list.size() == 0)
					return -1;
				else 
					return list.get(0);
			}
			i++;
		}
		return -1;
    }
};