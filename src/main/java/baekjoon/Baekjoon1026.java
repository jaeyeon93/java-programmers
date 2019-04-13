package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1026 {
    public static Integer solution(int [] arr1, int [] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;
        for (int i = 0; i < arr1.length; i++)
            sum += arr1[i] * arr2[arr2.length-1-i];
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            arr2[i] = sc.nextInt();

        System.out.println(solution(arr1, arr2));
    }
}
