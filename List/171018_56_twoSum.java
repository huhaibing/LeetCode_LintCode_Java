public class Solution {
    /*
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];
        for (int i=0; i<numbers.length; i++) {
        	for (int j=i+1; j<numbers.length; j++) {
        		if (numbers[i] + numbers[j] == target) {
        			ans[0] = i+1;
        			ans[1] = j+1;
        		}
        	}
        }
        
        return ans;
    }
}