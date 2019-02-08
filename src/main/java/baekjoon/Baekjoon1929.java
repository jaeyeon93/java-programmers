package baekjoon;

import java.util.Scanner;

public class Baekjoon1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n+1];

        for (int i = 0; i <= n; i++)
            arr[i] = 0;

        for (int i = 2; i <= n; i++)
            for (int j = 2; i*j <= n; j++) {
                arr[i*j] = 1;
                System.out.println("arr["+i*j+"] : "  + 1);
            }

        for (int i = m; i <= n; i++)
            if (arr[i] != 1)
                System.out.println(i);
    }
}
