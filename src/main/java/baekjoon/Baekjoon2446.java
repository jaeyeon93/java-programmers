package baekjoon;

import java.util.Scanner;

public class Baekjoon2446 {
    public static String star(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-k; i++)
            sb.append(" ");

        for (int i = 1; i <= 2*k-1; i++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--)
            System.out.println(star(n, i));
        for (int i = 2; i <= n; i++)
            System.out.println(star(n,i));
    }
}
