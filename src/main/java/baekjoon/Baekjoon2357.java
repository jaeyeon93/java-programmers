package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2357 {
    public static void solution(int [] arr, int a, int b) {
        int max = arr[a];
        int min = arr[a];
        for (int i = a; i <= b; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min + " " + max);
    }

    public static void solution2(int [] arr, int a, int b) {
        int [] array = Arrays.copyOfRange(arr, a, b+1);
        System.out.println("a : " + a + " b : " + b);
        for (Integer i : array)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("=========");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n+1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) {
            solution(arr, sc.nextInt(), sc.nextInt());
        }
    }
}
