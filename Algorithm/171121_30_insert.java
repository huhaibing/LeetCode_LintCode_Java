/**
插入区间
给出一个无重叠的按照区间起始端点排序的区间列表。
在列表中插入一个新的区间，你要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。

样例
插入区间[2, 5] 到 [[1,2], [5,9]]，我们得到 [[1,9]]。
插入区间[3, 4] 到 [[1,2], [5,9]]，我们得到 [[1,2], [3,4], [5,9]]。
*/

/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */


public class Solution {
    /*
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        if (intervals.size() == 0)
            intervals.add(newInterval);
        // 将 newInterval 按照顺序插入
        int f = 0, b = 0;
        for (int i=0; i<intervals.size(); i++) {
            Interval temp = intervals.get(i);
            if (newInterval.start > temp.start)
                f++;
        }
        System.out.println(f + "--" + b);
        intervals.add(f, newInterval);  
        
        // 合并区间
        for (int q=0; q<intervals.size()-1; q++) {
            Interval temp = intervals.get(q);
            Interval tempb = intervals.get(q+1);
            if (temp.end >= intervals.get(q+1).start) {
                temp.end = (tempb.end > temp.end ? tempb.end : temp.end);
                intervals.remove(q+1);
                q--;
            }
        }
        
        return intervals;
    }
}