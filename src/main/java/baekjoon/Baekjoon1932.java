package baekjoon;

import java.util.Scanner;

public class Baekjoon1932 {
    public static void solution(int [][] arr) {
        int [][] sum = new int[arr.length+1][arr.length+1];
        sum[0][0] = 0;
        for (int i = 1; i <= arr.length; i++)
            for (int j = 1; j <= arr.length; j++) {
                System.out.println("sum[i-1][j-1] : " + sum[i-1][j-1] + " arr[i][j] : " + arr[i][j]);
                sum[i][j] = sum[i-1][j-1] + arr[i][j];
            }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
//        for (int i = 0; i < n; i++)
//            for (int j = 0; j <= i; j++)
//                arr[i][j] = sc.nextInt();
        int [][] arr2 = {{7}, {3,8}, {8,1,0}, {2,7,4,4}, {4,5,2,6,5}};
        solution(arr2);
    }

}
