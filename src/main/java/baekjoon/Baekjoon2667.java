package baekjoon;

import java.util.Scanner;

public class Baekjoon2667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String [][] arr = new String[n][n];
        for (int i = 0; i < n; i++) {
            String [] input = sc.nextLine().split("");
            for (int j = 0; j < input.length; j++)
                arr[i][j] = input[j];
        }

    }
}
