package algorithm;

import java.util.Scanner;

public class Baekjoon1003_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int [][] f = new int[41][2];
        f[0][0] = 1;
        f[1][1] = 1;
        for (int i = 2; i < 41; i++)
            for (int j = 0; j < 2; j++)
                f[i][j] = f[i-1][j] + f[i-2][j];

        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            System.out.println(f[a][0] + " " + f[a][1]);
        }
    }
}
