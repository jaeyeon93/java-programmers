package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/9095
public class Baekjoon9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] d = new int[11];
        d[0] = 1;
        d[1] = 2;
        d[2] = 4;
        for (int i = 3; i <= 10; i++)
            d[i] = d[i-3] + d[i-2] + d[i-1];

        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
            System.out.println(d[sc.nextInt() -1]);
    }
}
