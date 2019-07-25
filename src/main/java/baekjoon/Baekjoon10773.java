package baekjoon;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int num = sc.nextInt();
            if (num == 0)
                stack.pop();
            else
                stack.push(num);
        }

        int sum = 0;
        while (stack.size() > 0) sum += stack.pop();
        System.out.println(sum);
    }
}
