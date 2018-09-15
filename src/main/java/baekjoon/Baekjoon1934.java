package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1934
public class Baekjoon1934 {
    public static Integer gcd(int a, int b) {
        if (a < b) {
            int r = b % a;
            if (r == 0)
                return a;
            return gcd(r, a);
        }
        int r = a % b;
        if (r == 0)
            return b;
        return gcd(r, b);
    }

    public static Integer lcm(int a, int b) {
        int gcd = gcd(a, b);
        return gcd * (a / gcd) * (b / gcd);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count;i ++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(lcm(a, b));
        }
    }
}
