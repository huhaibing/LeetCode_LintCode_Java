/**
171. 乱序字符串 
给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。

 注意事项
所有的字符串都只包含小写字母

样例
对于字符串数组 ["lint","intl","inlt","code"]

返回 ["lint","inlt","intl"]
*/

import java.util.Map.Entry;
public class Solution {
    /*
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i=0; i<strs.length; i++) {
			char[] cs = strs[i].toCharArray();
			Arrays.sort(cs);
			String str = String.valueOf(cs);
			if (!map.containsKey(str)) {
				List<Integer> li = new ArrayList<Integer>();
				li.add(i);
				map.put(str, li);
			} else {
				List<Integer> li = map.get(str);
				li.add(i);
				map.put(str, li);
			}
		}
		List<String> res = new ArrayList<String>();
		for (Entry<String, List<Integer>> iter : map.entrySet()) {
			if (iter.getValue().size() > 1) {
				for (int k : iter.getValue()) 
					res.add(strs[k]);
			} 
		}
		return res;
    }
}