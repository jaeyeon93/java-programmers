package baekjoon;

import java.util.Scanner;

public class Baekjoon2442 {
    public static String star(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2*n-1; i++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n-i; j++)
                sb.append(" ");
            sb.append(star(i));
            System.out.println(sb.toString());
        }
    }
}
