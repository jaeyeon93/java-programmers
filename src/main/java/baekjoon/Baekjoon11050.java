package baekjoon;

import java.util.Scanner;

public class Baekjoon11050 {
    public static Integer result(int n, int m) {
        return factorial(n)/(factorial(m)*factorial(n-m));
    }

    public static Integer factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(result(n, m));
    }
}
