/**
627. 最长回文串 
给出一个包含大小写字母的字符串。求出由这些字母构成的最长的回文串的长度是多少。
数据是大小写敏感的，也就是说，"Aa" 并不会被认为是一个回文串。

 注意事项
假设字符串的长度不会超过 1010。

样例
给出 s = "abccccdd" 返回 7
一种可以构建出来的最长回文串方案是 "dccaccd"。
*/

public class Solution {
    /*
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        if (s.length() == 0)
            return 0;
		int sum = 0, flag = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] cs = s.toCharArray();
		for (int i=0; i<cs.length; i++) {
			char c = cs[i];
			if (!map.containsKey(c))
				map.put(c, 1);
			else {
				map.put(c, map.get(c)+1);
			}
		}
		for (Integer iter : map.values()) {
			if (iter%2 == 0)
				sum += iter;
			else {
				sum += (iter-1);
				flag = 1;
			}
		}
		return (sum+flag);
    }
}