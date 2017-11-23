/**
702. 连接两个字符串中的不同字符 
给出两个字符串, 你需要修改第一个字符串，将所有与第二个字符串中相同的字符删除, 并且第二个字符串中不同的字符与第一个字符串的不同字符连接

样例
给出 s1 = aacdb, s2 = gafd。返回 cbgf
给出 s1 = abcs, s2 = cxzca。返回 bsxz
*/

public class Solution {
    /*
     * @param : the 1st string
     * @param : the 2nd string
     * @return: uncommon characters of given strings
     */
    public String concatenetedString(String s1, String s2) {
        // write your code here
        char[] cs2 = s2.toCharArray();
        String s = s1 + s2;
        for (int i=0; i<cs2.length; i++) {
            String temp = "" + cs2[i];
            if (s1.contains(temp)) {
                s = s.replace(temp, "");
            }
        }
        return s;
    }
};