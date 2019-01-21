package baekjoon;

import java.util.Scanner;

public class Baekjoon2443 {
    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2*n-1; i++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = count; i > 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < count-i; j++)
                sb.append(" ");
            sb.append(solution(i));
            System.out.println(sb.toString());
        }
    }
}
