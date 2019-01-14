package baekjoon;

import java.util.Scanner;

public class Baekjoon2444 {
    public static String start(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2*n-1; i++)
            sb.append("*");
        return sb.toString();
    }

    public static String convert(String star, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 1; i--)
            sb.append(" ");
        sb.append(star);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = n-i; j > 0; j--)
                sb.append(" ");
            sb.append(start(i));
            System.out.println(sb.toString());
        }
        for (int i = n-1; i > 0; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = n-i; j > 0; j--)
                sb.append(" ");
            sb.append(start(i));
            System.out.println(sb.toString());
        }
    }
}
