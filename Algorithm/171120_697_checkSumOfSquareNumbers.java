/**
判断是否为平方数之和
*/

public class Solution {
    /*
     * @param : the given number
     * @return: whether whether there're two integers
     */
    public boolean checkSumOfSquareNumbers(int num) {
        // write your code here
        
        if (num < 0)
            return false;
        int temp = (int)Math.sqrt(num);
        if (temp * temp == num)
            return true;
        int a=0;
        while (a < temp) {
            int b = temp;
            while (b >= a) {
                if (a*a + b*b == num)
                    return true;
                b--;
            }
            a++;
        }
        return false;
    }
};