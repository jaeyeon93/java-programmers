package baekjoon;

import java.util.Scanner;

public class Baekjoon1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] arr = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j <= i; j++)
                arr[i][j] = sc.nextInt();

        int sum = 0;
        int bigger = arr[0][0];
        int maxIdx = 0;
        sum += bigger;
        for (int i = 1; i < size; i++) {
            if (arr[i][maxIdx] > arr[i][maxIdx+1])
                maxIdx = maxIdx;
            else
                maxIdx = maxIdx+1;
            bigger = arr[i][maxIdx];
            sum += bigger;
//            System.out.println(i + "번째 sum : " + sum);
        }
        System.out.println(sum);
    }
}
