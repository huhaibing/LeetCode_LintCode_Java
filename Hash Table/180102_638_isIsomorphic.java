/**
638. 字符同构 
给定两个字符串 s 和 t ，确定它们是否是同构的。
两个字符串是同构的如果 s 中的字符可以被替换得到 t。
所有出现的字符必须用另一个字符代替，同时保留字符串的顺序。没有两个字符可以映射到同一个字符，但一个字符可以映射到自己。

 注意事项
你可以假定两个字符串 s 和 t 是一样长度的.

样例
给出 s = "egg", t= "add", 返回 true。
给出 s = "foo", t= "bar", 返回 false。
给出 s = "paper", t= "title", 返回 true。
*/

public class Solution {
    /*
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        // write your code here
        if (s.length() != t.length())
            return false;
		Map<Character, Character> map = new HashMap<Character, Character>();
		char[] cs = s.toCharArray();
		char[] ct = t.toCharArray();
		for (int i=0; i<s.length(); i++) {
			char ss = cs[i];
			char tt = ct[i];
			if (map.containsKey(ss)) {
				if (map.get(ss) != tt)
					return false;
			} else {
				if (map.containsValue(tt))
					return false;
				else
					map.put(ss, tt);
			}
		}
		return true;
    }
}