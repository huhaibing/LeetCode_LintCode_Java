/*
写一个算法来判断一个数是不是"快乐数"。
一个数是不是快乐是这么定义的：对于一个正整数，每一次将该数替换为他每个位置上的数字的平方和，然后重复这个过程直到这个数变为1，或是无限循环但始终变不到1。如果可以变为1，那么这个数就是快乐数。

样例
19 就是一个快乐数。
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
*/

public class Solution {
    /*
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    public boolean isHappy(int n) {
        // write your code here
        int num = 0;
        while (n != 1){
            num += 1;
            int m = 0;
            String cn = n + ""; //int转String的常用方法
            for (int i=0; i < cn.length(); i++){
                m += (Integer.parseInt(cn.substring(i,i+1)))*(Integer.parseInt(cn.substring(i,i+1)));    //Java中^2表示亦或，而不是平方
            }
            n = m;
            /*设置循环次数上限*/
            if (num >= 20)
                return false;
        }
        return true;
    }
}