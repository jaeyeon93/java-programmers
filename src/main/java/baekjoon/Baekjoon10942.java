package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10942 {
    public static Integer solution(int [] arr, int i, int j) {
        for (int k = i-1; k < j-1; k++)
            if (arr[k] != arr[j-k+i])
                return 0;
        return 1;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(solution(arr, sc.nextInt(), sc.nextInt()));

    }
}
