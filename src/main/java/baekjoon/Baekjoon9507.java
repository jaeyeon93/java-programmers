package baekjoon;

import java.util.Scanner;

public class Baekjoon9507 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long [] arr = new long[68];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for (int i = 4; i <= 67; i++)
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4];
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(arr[sc.nextInt()]);
    }
}
