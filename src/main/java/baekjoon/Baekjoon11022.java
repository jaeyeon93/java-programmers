package baekjoon;

import java.util.Scanner;

public class Baekjoon11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum = n+m;
            System.out.println("Case #" + i + ": " + n + " + " + m + " = " + sum);
        }
    }
}
