package baekjoon;

import java.util.Scanner;

public class Baekjoon11659 {
    public static Integer solution(int [] sum, int i, int j) {
        return sum[j] - sum[i-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int [] sum = new int[n+1];
        sum[0] = 0;

        for (int i = 1; i <= n; i++)
            sum[i] = arr[i-1] + sum[i-1];

        for (int i = 0; i < m; i++)
            System.out.println(solution(sum, sc.nextInt(), sc.nextInt()));
    }
}
