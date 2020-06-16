package baekjoon;

import java.util.Scanner;

public class Baekjoon14501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] t = new int[n];
        int [] p = new int[n];
        int [] max = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        // i부터 시작할때.
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (j+t[j]-1 < n)
                    max[i] += p[j];
                j += t[j]-1;
            }
        }

        for (int price : max)
            System.out.println(price);
    }
}
