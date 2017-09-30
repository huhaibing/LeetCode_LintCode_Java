/*给出若干闭合区间，合并所有重叠的部分。

样例
给出的区间列表 => 合并后的区间列表：
[                     [
  [1, 3],               [1, 6],
  [2, 6],      =>       [8, 10],
  [8, 10],              [15, 18]
  [15, 18]            ]
]
*/

//先排序 然后根据i位置的end与i+1位置的star比较 如果有重叠 则表示可以合并 合并后的end为i与i+1位置上的最大值。
/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 */

import java.util.*;

public class Solution {

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new LinkedList<>();

        if (intervals == null || intervals.size() < 1) {
            return result;
        }

        // 先对区间进行排序，使用一个匿名内部类
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        // 排序后，后一个元素（记为next）的start一定是不小于前一个（记为prev）start的，
        // 对于新添加的区间，如果next.start大于prev.end就说明这两个区间是分开的，要添
        // 加一个新的区间，否则说明next.start在[prev.start, prev.end]内，则只要看
        // next.end是否是大于prev.end，如果大于就要合并区间（扩大）
        Interval prev = null;
        for (Interval item : intervals) {

            if (prev == null || prev.end < item.start) {
                result.add(item);
                prev = item;
            } else if (prev.end < item.end) {
                prev.end = item.end;
            }
        }

        return result;
    }
}