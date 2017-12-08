/*
判断字符串是否没有重复字符 
实现一个算法确定字符串中的字符是否均唯一出现
*/

public class Solution {
    /*
     * @param str: A string
     * @return: a boolean
     */
    public boolean isUnique(String str) {
		for (int i=0; i<str.length(); i++) {
			for (int j=i+1; j<str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
				
			}
		}
		return true;
	}
}