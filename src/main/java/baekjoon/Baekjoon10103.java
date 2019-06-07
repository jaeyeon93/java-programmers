package baekjoon;

import java.util.Scanner;

public class Baekjoon10103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 100;
        int second = 100;
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b)
                second -= a;
            if (a < b)
                first -= b;
        }
        System.out.println(first);
        System.out.println(second);
    }
}
