package baekjoon;

import java.util.Scanner;

public class Baekjoon10992 {
    public static String star(int i, int n) {
        StringBuilder sb = new StringBuilder();
        if (i == 1) {
            for (int j = 0; j < n-1; j++)
                sb.append(" ");
            sb.append("*");
            return sb.toString();
        }

        if (i == n) {
            for (int j = 0; j < 2*n-1; j++)
                sb.append("*");
            return sb.toString();
        }

        for (int j = 0; j < n-i; j++) {
            sb.append(" ");
        }
        sb.append("*");
        for (int j = 0; j < 2*i-3; j++)
            sb.append(" ");
        sb.append("*");
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
            System.out.println(star(i, n));
    }
}
