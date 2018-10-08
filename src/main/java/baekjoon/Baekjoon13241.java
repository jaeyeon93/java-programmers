package baekjoon;

import java.util.Scanner;

public class Baekjoon13241 {
    public static long gcd(long a, long b) {
        long r = b % a;
        if (r == 0)
            return a;
        return gcd(r, a);
    }

    public static long lcm(long a, long b) {
        return (a / gcd(a, b)) * (b / gcd(a, b)) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        if (a > b)
            System.out.println(lcm(b, a));
        System.out.println(lcm(a, b));
    }
}
