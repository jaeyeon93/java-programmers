package baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon4949 {
    public static String solution(String [] input) {
        Stack<String> stack = new Stack<>();
        for (String s : input) {
            if (s.equals("("))
                stack.push(s);
            else if (s.equals("["))
                stack.push(s);
            else if (s.equals(")") && stack.size() != 0) {
                if (stack.peek().equals("("))
                    stack.pop();
            } else if (s.equals("]") && stack.size() != 0) {
                if (stack.peek().equals("["))
                    stack.pop();
            }
        }

        if (stack.size() == 0)
            return "yes";
        return "no";
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if (str.equals(".")) {
                break;
            } else {
                String [] input = str.split("");
                System.out.println(solution(input));
            }
        }
    }
}
