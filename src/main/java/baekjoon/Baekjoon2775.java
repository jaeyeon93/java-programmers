package baekjoon;

import java.util.Scanner;

public class Baekjoon2775 {
    public static Integer solution(int [][] arr, int i, int j) {
        for (int k = 1; k <= j; k++)
            arr[i][j] += arr[i-1][k];
        return arr[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int [][] arr = new int[15][15];
        for (int i = 1; i < arr.length; i++)
            arr[0][i] = i;

        for (int i = 1; i < arr.length; i++) // 층수
            for (int j = 0; j < arr.length; j++) { // 호수
                solution(arr, i, j);
            }

        for (int i = 0; i < t; i++)
            System.out.println(arr[sc.nextInt()][sc.nextInt()]);
    }
}
