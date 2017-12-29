/**
424. 逆波兰表达式求值 
求逆波兰表达式的值。

在逆波兰表达法中，其有效的运算符号包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰计数表达。

样例
["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
*/

public class Solution {
    /*
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    public int evalRPN(String[] tokens) {
        // write your code here
        Stack<String> stack = new Stack<String>();
        for (int i=0; i < tokens.length; i++) {
            String str = tokens[i];
            if (isOperator(str)) {
                int n1 = Integer.parseInt(stack.pop());
                int n2 = Integer.parseInt(stack.pop());
                int temp = helpOperator(str, n2, n1);
                stack.push(""+temp);
                
            } else { 
                stack.push(str);
            }
        }
        int ans = Integer.parseInt(stack.peek());
        return ans;
    }
    public boolean isOperator(String c) {
        if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/"))
            return true;
        else 
            return false;
    }
    public int helpOperator(String c, int n1, int n2) {
        switch (c) {
            case "+":
                return n1+n2;
            case "-":
                return n1-n2;
            case "*":
                return n1*n2;
            case "/":
                return n1/n2;
        }
        return -1;
    }
}