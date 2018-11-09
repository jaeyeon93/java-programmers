package baekjoon;

import java.util.Scanner;

public class Baekjoon1003_2 {
    public static int solution(int n) {
        int [] arr = new int[100];
        if (n < 0)
            return 0;

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[n] = arr[n-1] + arr[n-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i< count; i++) {
            int n = sc.nextInt();
            solution(n);
        }
    }
}
