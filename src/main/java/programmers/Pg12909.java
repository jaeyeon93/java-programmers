package programmers;

import java.util.List;
import java.util.Stack;

public class Pg12909 {
    public static boolean solution(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == "(".charAt(0)) {
                if (s.charAt(i) == "(".charAt(0))
                    stack.push("(");

                if (s.charAt(i) == ")".charAt(0))
                    stack.pop();
            }

            if (s.charAt(0) == ")".charAt(0)) {
                if (s.charAt(i) == ")".charAt(0))
                    stack.push(")");

                if (s.charAt(i) == "(".charAt(0))
                    stack.pop();
            }
        }

        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
    }
}
