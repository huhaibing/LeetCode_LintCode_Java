/**
8. 旋转字符串 
给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)

样例
对于字符串 "abcdefg".

offset=0 => "abcdefg"
offset=1 => "gabcdef"
offset=2 => "fgabcde"
offset=3 => "efgabcd"
*/

public class Solution {
    /*
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length == 0)
            return ;
        offset = offset % str.length;   // 如果offset为1000000
        for (int i=0; i<offset; i++) {
            char temp = str[str.length-1];
            for (int j=str.length-1; j>0; j--) {
                str[j] = str[j-1];
            }
            str[0] = temp;
        }
    }
}