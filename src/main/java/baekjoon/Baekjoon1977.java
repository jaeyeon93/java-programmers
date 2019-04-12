package baekjoon;

import java.util.Scanner;

public class Baekjoon1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean [] arr = new boolean[100001];
        for (int i = 1; i < arr.length; i++)
            arr[i] = false;

        for (int i = 1; i <= 100; i++)
            arr[i*i] = true;

        int sum = 0;
        int min = n;
        for (int i = m; i <= n; i++) {
            if (arr[i]) {
                sum += i;
                if (i < min)
                    min = i;
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
