package baekjoon;

import java.util.Scanner;

public class Baekjoon2439 {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--)
            System.out.println(solution(i));
    }
}
