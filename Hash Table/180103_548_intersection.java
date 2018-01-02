/**
548. 两数组的交 II 
计算两个数组的交

 注意事项
每个元素出现次数得和在数组里一样
答案可以以任意顺序给出

样例
nums1 = [1, 2, 2, 1], nums2 = [2, 2], 返回 [2, 2].
*/

public class Solution {
    
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0, j=0;
		while (i < nums1.length) {
			while (j<nums2.length && nums1[i]>=nums2[j]) {
				if (nums1[i] == nums2[j]) {
					ans.add(nums1[i]);
					j++;
					break;
				}
				j++;
			}
			i++;
		}
		int[] a = new int[ans.size()];
		for (int k=0; k<ans.size(); k++) {
			a[k] = ans.get(k);
		}
		return a;
    }
};