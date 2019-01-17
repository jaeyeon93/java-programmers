package baekjoon;

import java.util.Scanner;

public class Baekjoon2445 {
    public static String forward(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++)
            sb.append("*");
        for (int i = 0; i < n-k; i++)
            sb.append(" ");
        return sb.toString();
    }

    public static String back(int n, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-k; i++)
            sb.append(" ");
        for(int i = 1; i <= k; i++)
            sb.append("*");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(forward(n, i));
            sb.append(back(n,i));
            System.out.println(sb.toString());
        }
        for(int i = n-1; i >= 1; i--) {
            StringBuilder sb = new StringBuilder();
            sb.append(forward(n, i));
            sb.append(back(n,i));
            System.out.println(sb.toString());
        }
    }
}
