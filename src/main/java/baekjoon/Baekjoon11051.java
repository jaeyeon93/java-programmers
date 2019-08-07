package baekjoon;

import java.util.Scanner;

public class Baekjoon11051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long [][] arr = new long[1001][1001];
        arr[0][0] = 1;
        arr[1][1] = 1;
        arr[1][0] = 1;
        for (int i = 2; i <= 1000; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
            for (int j = 1; j <= i; j++)
                arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % 10007;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        System.out.println(arr[n][k]);
    }
}
