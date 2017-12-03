/**
211. 字符串置换 
给定两个字符串，请设计一个方法来判定其中一个字符串是否为另一个字符串的置换。

置换的意思是，通过改变顺序可以使得两个字符串相等。

样例
"abc" 为 "cba" 的置换。
"aabc" 不是 "abcc" 的置换。
*/

public class Solution {
    /*
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        // write your code here
        char[] ca = A.toCharArray();
        char[] cb = B.toCharArray();
        Arrays.sort(ca);
        Arrays.sort(cb);
        if (ca.length != cb.length)
            return false;
        for (int i=0; i<ca.length; i++) {
            if (ca[i] != cb[i])
                return false;
        }
        return true;
    }
}