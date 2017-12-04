/**
655. 大整数加法 
以字符串的形式给出两个非负整数 num1 和 num2，返回 num1 和 num2 的和。

 注意事项
num1 和 num2 的长度都小于5100。
num1 和 num2 都只包含数字 0-9。
num1 和 num2 都不包含任何前导零。
您不能使用任何内置的BigInteger库内的方法或直接将输入转换为整数。
样例
给定 num1 = "123"，num2 = "45" 
返回 "168"
*/

public class Solution {
    /*
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        // write your code here
        if (num1.length()==0 || num2.length()==0)
            return num1+num2;
        char[] cn1 = num1.toCharArray();
        char[] cn2 = num2.toCharArray();
        String ans = "";
        int minlen = (cn1.length < cn2.length ? cn1.length : cn2.length),
            flag = 0, sum = 0;
        for (int i=1; i<=minlen; i++) {
            sum = (int)cn1[cn1.length-i] + (int)cn2[cn2.length-i] - 48*2 + flag;
            flag = sum / 10;
            sum = sum % 10;
            ans = "" + sum + ans;
        }
        while (minlen < cn1.length) {
            sum = (int)cn1[cn1.length-1-minlen] - 48 + flag;
            minlen ++;
            flag = sum / 10;
            sum = sum % 10;
            ans = "" + sum + ans;
        }
        while (minlen < cn2.length) {
            sum = (int)cn2[cn2.length-1-minlen] - 48 + flag;
            minlen ++;
            flag = sum / 10;
            sum = sum % 10;
            ans = "" + sum + ans;
        }
        if (flag == 1)
            ans = "" +  flag + ans;
        return ans;
    }
}