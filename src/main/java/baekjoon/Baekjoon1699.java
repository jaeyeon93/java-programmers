package baekjoon;

import java.util.Scanner;

public class Baekjoon1699 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 1;
        for (int i = 5; i <= n; i++)
            arr[i] = (i/4)*arr[4] + arr[(i % 4)];

        for (int i = 1; i <= n; i++)
            System.out.println(i + " : " + arr[i]);
    }
}
