/**
774. 重复 
所有的DNA由一系列缩写的核苷酸 A, C, G 和 T组成. 
比如; "ACGAATTCCG". 在研究 DNA 时, 有时候鉴别出 DNA 中的重复序列是很有用的. 
写一个函数来找到所有在 DNA 中出现超过一次且长度为 10个字母 的序列(子串).

样例
给出 S = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
返回 ["AAAAACCCCC", "CCCCCAAAAA"].
*/

import java.util.Map.Entry;
public class Solution {
    /**
     * @param s: a string represent DNA sequences
     * @return: all the 10-letter-long sequences 
     */
    public List<String> findRepeatedDna(String s) {
        // write your code here
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		List<String> res = new ArrayList<String>();
		for (int i=0; i<s.length()-9; i++) {
			String str = s.substring(i, i+10);
			if (!map.containsKey(str))
				map.put(str, 1);
			else
				map.put(str, map.get(str)+1);
		}
		for (Entry<String, Integer> iter : map.entrySet()) {
			if (iter.getValue() > 1)
				res.add(iter.getKey());
		}
		return res;
    }
}