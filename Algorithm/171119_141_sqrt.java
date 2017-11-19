//

public class Solution {
    /*
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        int min=0, max=x;
        if (max * max == x)
            return max;
        while (max-min > 1) {
            int mid = (max + min) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x/mid) {
                max = mid;
            } else if (mid < x/mid) {
                min = mid;
            }
        }
        return (max-x/max < x/min-min ? max : min);
    }
}