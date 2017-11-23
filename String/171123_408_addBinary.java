/**
二进制求和
*/

public class Solution {
    /*
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    public String addBinary(String a, String b) {
        // write your code here
        int minlen = Math.min(a.length(), b.length());
        int flag = 0, i=1;
        String ans = "";
        for ( ; i<=minlen; i++) {
            // char --> int, 如果用(int)'a'，则必须减去'0'
            int sum = a.charAt(a.length()-i) + b.charAt(b.length()-i) - 2 * '0' + flag;
            ans = "" + (sum%2) + ans;
            flag = sum / 2;
        }
        System.out.println(ans);
        String c = (a.length() > b.length() ? a : b);
        while (i <= c.length()) {
        	int sum = c.charAt(c.length() - i) - '0' + flag;
        	ans = "" + (sum%2) + ans;
        	flag = sum / 2;
        	i++;
        }
        if (flag == 1)
        	ans = "1" + ans;
        System.out.println(ans);
        return ans;
    }
}