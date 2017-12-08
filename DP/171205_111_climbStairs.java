/**
111. 爬楼梯 
假设你正在爬楼梯，需要n步你才能到达顶部。但每次你只能爬一步或者两步，你能有多少种不同的方法爬到楼顶部？

样例
比如n=3，1+1+1=1+2=2+1=3，共有3种不同的方法
返回 3
*/

public class Solution {
    /**
     * @param n: An integer
     * @return: An integer
     */
    public int climbStairs(int n) {
        // write your code here
        if (n==0 || n==1 || n==2)
            return n;
        int i=2, f=1, num=2;
        while (i < n) {
            int temp = num;
            num += f;
            f = temp;
            i++;
        }
        return num;
    }
}