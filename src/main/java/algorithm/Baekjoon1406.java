package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://www.acmicpc.net/problem/1406
public class Baekjoon1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        // 초기 문자열을 왼쪽 스택에 우선 넣는다.
        for (int i = 0; i < s.length(); i++)
            left.push(s.charAt(i));

        int m = Integer.parseInt(br.readLine());
        while (m --> 0) {
            String [] line = br.readLine().split(" ");
            char command = line[0].charAt(0);
            if (command == 'L')
                if (!left.empty())
                    right.push(left.pop());
            if (command == 'D')
                if (!right.empty())
                    left.push(right.pop());
            if (command == 'P')
                left.push(line[1].charAt(0));
            if (command == 'B')
                if (!left.empty())
                    left.pop();
        }

        while (!left.empty())
            right.push(left.pop());
        StringBuilder sb = new StringBuilder();
        while (!right.empty())
            sb.append(right.pop());
        System.out.println(sb);
    }
}
