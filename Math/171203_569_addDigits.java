/**
569. 各位相加 
给出一个非负整数 num，反复的将所有位上的数字相加，直到得到一个一位的整数。

样例
给出 num = 38。
相加的过程如下：3 + 8 = 11，1 + 1 = 2。因为 2 只剩下一个数字，所以返回 2。
*/

public class Solution {
    /*
     * @param num: a non-negative integer
     * @return: one digit
     */
    public int addDigits(int num) {
        // write your code here
        while (num > 9) {
            char[] cs = String.valueOf(num).toCharArray();
            num = 0;
            for (int i=0; i<cs.length; i++) {
                num += (int)cs[i];
                num -= 48;
            }
        }
        return num;
    }
}