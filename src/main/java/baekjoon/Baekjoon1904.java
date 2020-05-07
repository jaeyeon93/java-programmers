package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1904
public class Baekjoon1904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int [] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++)
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        System.out.println(arr[n]);
    }
}
