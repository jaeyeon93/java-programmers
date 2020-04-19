package baekjoon;

import java.util.Scanner;

public class Baekjoon10996 {
    public static String solution(int i, int n) {
        StringBuilder sb = new StringBuilder();
        if (i % 2 == 0) {
            // 짝수일때
            for (int current = 0; current < n; current++)
                if (current % 2 == 0)
                    sb.append(" ");
                else
                    sb.append("*");
            return sb.toString();
        }
        // 홀수 일때.
        for (int current = 0; current < n; current++)
            if (current % 2 == 0)
                sb.append("*");
            else
                sb.append(" ");
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("*");
            return;
        }

        for (int i = 1; i <= 2*n; i++)
            System.out.println(solution(i, n));
    }
}
