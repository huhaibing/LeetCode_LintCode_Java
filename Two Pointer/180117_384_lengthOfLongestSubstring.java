/**
384. 最长无重复字符的子串 
给定一个字符串，请找出其中无重复字符的最长子字符串。

样例
例如，在"abcabcbb"中，其无重复字符的最长子字符串是"abc"，其长度为 3。
对于，"bbbbb"，其无重复字符的最长子字符串为"b"，长度为1。
*/

public class Solution {
    /*
     * @param s: a string
     * @return: an integer
     */
    public int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s.length() == 0 || s.length() == 1)
            return s.length();
		int maxlen = 0, phead = 0, ptail = 1, i = 1;
		while (i < s.length()) {
			String temp = s.substring(i, i+1);
			if (!s.substring(phead, ptail).contains(temp)) {
				ptail = ++i;
			} else {
				phead += s.substring(phead, ptail).indexOf(temp)+1;
				ptail = ++i;
			}
			if (ptail - phead > maxlen)
				maxlen = ptail - phead;
		}
		return maxlen;
    }
}