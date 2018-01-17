/**
49. 字符大小写排序 
给定一个只包含字母的字符串，按照先小写字母后大写字母的顺序进行排序。

 注意事项
小写字母或者大写字母他们之间不一定要保持在原始字符串中的相对位置。

样例
给出"abAcD"，一个可能的答案为"acbAD"
*/

public class Solution {
    /*
     * @param chars: The letter array you should sort by Case
     * @return: nothing
     */
    public void sortLetters(char[] chars) {
        // write your code here
		int phead = 0, ptail = chars.length-1;
		while (phead < ptail) {
			while (phead < ptail && chars[phead] >= 'a' && chars[phead] <= 'z')
				phead ++;
			while (phead < ptail && chars[ptail] >= 'A' && chars[ptail] <= 'Z')
				ptail --;
			Character temp = chars[phead];
			chars[phead] = chars[ptail];
			chars[ptail] = temp;
		}
    }
}