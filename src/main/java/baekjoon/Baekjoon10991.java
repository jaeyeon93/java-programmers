package baekjoon;

import java.util.Scanner;

public class Baekjoon10991 {
    public static String start(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 2*n-1; i++) {
            if (i % 2 == 0)
                sb.append(" ");
            if (i % 2 != 0)
                sb.append("*");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j <= n-i; j++)
                sb.append(" ");
            System.out.println(sb.append(start(i)).toString());
        }
    }
}
