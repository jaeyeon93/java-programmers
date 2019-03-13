package baekjoon;

import java.util.Scanner;

public class Baekjoon2167 {

    public static Integer solution(int i, int j, int x, int y, int [][] arr) {
        int sum = 0;
        for (int s = i; s < x; s++)
            for (int e = j; e < y; e++) {
                sum += arr[s][e];
            }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        int k = sc.nextInt();
        for (int p = 0; p < k; p++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(solution(i, j, x, y, arr));
        }
    }
}
