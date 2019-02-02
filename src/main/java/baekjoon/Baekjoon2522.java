package baekjoon;

import java.util.Scanner;

public class Baekjoon2522 {
    public static String star(int n, int i) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n-i; j++)
            sb.append(" ");

        for (int j = 0; j < i; j++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(star(n, i));
        }
        for (int i = n-1; i > 0; i--) {
            System.out.println(star(n,i));
        }
    }
}
