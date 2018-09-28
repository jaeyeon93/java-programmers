package baekjoon;

import java.util.Scanner;

public class Baekjoon2193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long [] arr = new long[num+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= num; i++)
            arr[i] = arr[i-1] + arr[i-2];

        System.out.println(arr[num]);
    }
}
