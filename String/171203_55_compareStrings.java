/**
55. 比较字符串 
比较两个字符串A和B，确定A中是否包含B中所有的字符。字符串A和B中的字符都是 大写字母

 注意事项
在 A 中出现的 B 字符串里的字符不需要连续或者有序。

样例
给出 A = "ABCD" B = "ACD"，返回 true
给出 A = "ABCD" B = "AABC"， 返回 false
*/
public class Solution {
    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        char[] ca = A.toCharArray();
        char[] cb = B.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if (ca.length < cb.length)
            return false;
        int i=0, j=0;
        while (j < cb.length) {
            while (i < ca.length && ca[i] != cb[j]) {
                i++;
            }
            if (i == ca.length)
                return false;
            j++;
            i++;
        }
        return true;
    }
}