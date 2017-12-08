public class Solution {
    /*
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public int[] plusOne(int[] digits) {
		int flag = 0;
		digits[digits.length-1]++;
		for (int i=digits.length-1; i>=0; i--) {
			int sum = digits[i] + flag;
			digits[i] = sum%10;
			flag = sum/10;
			
		}
		if (flag == 1) {
			int[] temp = new int[digits.length+1];
			temp[0] = 1;
			for (int k=0; k<digits.length; k++) {
				temp[k+1] = digits[k];
			}
			digits = temp;
		}
		
		return digits;
    }
}