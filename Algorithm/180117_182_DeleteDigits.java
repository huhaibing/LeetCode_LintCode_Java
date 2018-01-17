/**
182. 删除数字 
给出一个字符串 A, 表示一个 n 位正整数, 删除其中 k 位数字, 使得剩余的数字仍然按照原来的顺序排列产生一个新的正整数。
找到删除 k 个数字之后的最小正整数。
N <= 240, k <= N

样例
给出一个字符串代表的正整数 A 和一个整数 k, 其中 A = 178542, k = 4
返回一个字符串 "12"
*/

public class Solution {
    /*
     * @param A: A positive integer which has N digits, A is a string
     * @param l: Remove k digits
     * @return: A string
     */
    public String DeleteDigits(String A, int l) {
        // write your code here
		if (A.length() == l)
			return "";
		char[] cs = A.substring(A.length()-l).toCharArray();
		char[] ans = A.substring(0, A.length()-l).toCharArray();
		for (int i=0; i<cs.length; i++) {
			for (int j=0; j<ans.length-1; j++) {
				if (ans[j] > ans[j+1]) {
					for (; j<ans.length-1; j++) {
						ans[j] = ans[j+1];
					}
					ans[j] = cs[i];
					break;
				}
			}
			if (ans[ans.length-1] > cs[i])
				ans[ans.length-1] = cs[i];
		}
		int k = 0;
		while (k < ans.length) {
			if (ans[k] == '0') {
			    k++;
			}
			else
				break;
		}
		return String.valueOf(ans).substring(k);
    }
}