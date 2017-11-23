/**
53. 翻转字符串 
给定一个字符串，逐个翻转字符串中的每个单词。

说明
单词的构成：无空格字母构成一个单词
输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
*/

public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if (s == " ")
            return s;
        String[] ss = s.split(" ");
        if (ss.length == 0)
            return s;
        String ans = "";
        for (int i=ss.length-1; i>=0; i--) {
            ans += ss[i];
            ans += " ";
        }
        ans = ans.substring(0, ans.length()-1);
        return ans;
    }
}