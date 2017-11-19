/**
猜数游戏
*/
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    /**
     * @param n an integer
     * @return the number you guess
     */
    public int guessNumber(int n) {
        // Write your code here
        int ans = 2;
        int min = 0, max = n;
        while (ans != 0 && (max-min>1)) {
            int mid = (min + max) / 2;
            ans = guess(mid);
            if (ans == 1) {
                min = mid;
            } else if (ans == -1) {
                max = mid;
            } else {
                return mid;
            }
        }
        return (guess(min)==0 ? min : max);
    }
}