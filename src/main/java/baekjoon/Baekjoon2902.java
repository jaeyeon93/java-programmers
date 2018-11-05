package baekjoon;

import java.util.Scanner;

public class Baekjoon2902 {
    public static String solution(String input) {
        String [] arr = input.split("-");
        StringBuilder builder = new StringBuilder();
        for (String s : arr)
            builder.append(s.charAt(0));
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
}
