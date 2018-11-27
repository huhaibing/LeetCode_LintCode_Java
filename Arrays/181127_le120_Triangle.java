import java.lang.Math;
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[] res = new int[len];
        res[0] = triangle.get(0).get(0);
        
        for (int i=1; i<len; i++) {
            int[] sum = new int[len];
            for (int j=0; j<i+1; j++) {
                if (j == 0)
                    sum[0] = triangle.get(i).get(j) + res[0];
                else if (j == i)
                    sum[i] = triangle.get(i).get(j) + res[j-1];
                else
                    sum[j] = triangle.get(i).get(j) + Math.min(res[j-1], res[j]);
            }
            res = sum;
        }
        int mind = Integer.MAX_VALUE;
        for (int i=0; i<len; i++) {
            if (res[i] < mind)
                mind = res[i];
        }
        return mind;
    }
}