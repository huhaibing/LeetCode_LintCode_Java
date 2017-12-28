/**
575. 表达式展开 
给出一个表达式 s，此表达式包括数字，字母以及方括号。在方括号前的数字表示方括号内容的重复次数(括号内的内容可以是字符串或另一个表达式)，请将这个表达式展开成一个字符串。

样例
S = abc3[a] 返回 abcaaa
S = 3[abc] 返回 abcabcabc
S = 4[ac]dy 返回 acacacacdy
S = 3[2[ad]3[pf]]xyz 返回 adadpfpfpfadadpfpfpfadadpfpfpfxyz
*/

public class Solution {
    /*
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c!=']') 
                stack.push(c);
            else {
                String str = "", ss = "";
                while (stack.peek() != '[')
                    ss += stack.pop();
                stack.pop();
                String sn = "";
                while (!stack.empty() && stack.peek()>='0' && stack.peek()<='9') {
                    sn = stack.pop() + sn;
                }
                int j=0, n=Integer.parseInt(sn);
                while (j<n) {
                    str += ss;
                    j++;
                }
                for (int k=str.length()-1; k>=0; k--)
                    stack.push(str.charAt(k));
            }
        }
        String ans = "";
        while (!stack.empty())
            ans = stack.pop() + ans;
        return ans;
    }
}