package leetcode;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/submissions/
public class ValidParentheses {
    public static boolean isValid(String s) {
        boolean result = false;
        char [] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            } else if (c == ']') {
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            } else {
                if (!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }

        if (stack.isEmpty()) result = true;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
