/**
57. 三数之和 
给出一个有n个整数的数组S，在S中找到三个整数a, b, c，找到所有使得a + b + c = 0的三元组。

 注意事项
在三元组(a, b, c)，要求a <= b <= c。
结果不能包含重复的三元组。

样例
如S = {-1 0 1 2 -1 -4}, 你需要返回的三元组集合的是：

(-1, 0, 1)

(-1, -1, 2)
*/

public class Solution {
    /*
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        int len = numbers.length;
        Arrays.sort(numbers);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i=0; i<len-2; i++) {
            for (int j=i+1; j<len-1; j++) {
                for (int p=j+1; p<len; p++) {
                    if (numbers[i]+numbers[j]+numbers[p] == 0) {
                        List<Integer> ll = new ArrayList<Integer>();
                        ll.add(numbers[i]);
                        ll.add(numbers[j]);
                        ll.add(numbers[p]);
                        if (!ans.contains(ll))
                            ans.add(ll);
                    }
                }
            }
        }
        return ans;
    }
}