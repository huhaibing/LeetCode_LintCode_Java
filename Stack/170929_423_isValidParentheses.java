/*
给定一个字符串所表示的括号序列，包含以下字符： '(', ')', '{', '}', '[' and ']'， 判定是否是有效的括号序列。
样例
括号必须依照 "()" 顺序表示， "()[]{}" 是有效的括号，但 "([)]"则是无效的括号。
*/

public class Solution {
    /*
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        boolean flag = true;
        if (s.length() == 0)
            return true;
        else {
            Stack<Character> symbol = new Stack<Character>();
            int i = 0;
            while (flag == true && i<s.length()){
                char x = s.charAt(i);
                if (x == '(' || x == '[' || x == '{')
                    symbol.push(x);
                else if (x == ')' && (!symbol.empty()) && symbol.peek() == '('){
                    symbol.pop();
                } else if (x == ']' && (!symbol.empty()) && symbol.peek() == '['){
                    symbol.pop();
                } else if (x == '}' && (!symbol.empty()) && symbol.peek() == '{'){
                    symbol.pop();
                } else {
                    flag = false;
                }
                i++;
            }
            if (!symbol.empty())
                flag = false;
            return flag;
        }
    }
}