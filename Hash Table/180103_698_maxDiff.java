/**
698. 数组中最大的差值 
给 m 个数组, 每一个数组均为升序. 现在你可以从两个不同的数组中挑选两个整数(每一个数组选一个)并且计算差值. 我们将两个整数 a 和 b 之间的差定义为它们的绝对差 |a - b|. 你的任务是去找到最大的差值.

 注意事项
每一个给出的数组长度至少为 1. 至少有两个不为空的数组
m 个数组中所有整数的个数和在 [2, 10000]范围内.
m 个数组中所有的整数均将在[-10000, 10000]范围内.

样例
给一个数组 [[1,2,3], [4,5], [1,2,3]], 返回 4
获得最大差值的一种方式是在第一个数组或第三个数组中取 1, 在第二个数组中取 5.
*/

public class Solution {
    /*
     * @param : an array of arrays
     * @return: return the max distance among arrays
     */
    public int maxDiff(int[][] arrs) {
        // write your code here
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i=0; i<arrs.length-1; i++) {
			for (int j=i+1; j<arrs.length; j++) {
				int is = arrs[i][0], ie = arrs[i][arrs[i].length-1], 
						js = arrs[j][0], je = arrs[j][arrs[j].length-1];
				int t1=je-is, t2=ie-js;
				if (t1 < min || t2 < min)
					min = (t1 < t2 ? t1 : t2);
				if (t1 > max || t2 > max)
					max = (t1 > t2 ? t1 : t2);
			}
		}
		return (0-min > max ? 0-min : max);
    }
};