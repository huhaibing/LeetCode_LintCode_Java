/**
斐波那契数列
*/

public class Solution {
    /*
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        int n1=0, n2=1, i=2;
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        while (i < n) {
            int temp = n2;
            n2 = n2 + n1;; 
            n1 = temp;
            i++;
        }
        return n2;
    }
}