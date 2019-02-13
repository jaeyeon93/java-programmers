package baekjoon;

import java.util.Scanner;

public class Baekjoon10995 {

    public static String star(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++)
            sb.append("* ");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println(star(n));
            if (i % 2 == 0) {
                System.out.print(" ");
                System.out.println(star(n));
            }
        }
    }
}
