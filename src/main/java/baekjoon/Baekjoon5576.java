package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon5576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] w = new int[10];
        for (int i = 0; i < 10; i++)
            w[i] = sc.nextInt();
        int [] k = new int[10];
        for (int i = 0; i < 10; i++)
            k[i] = sc.nextInt();
        Arrays.sort(w);
        Arrays.sort(k);
        int wSum = w[7] + w[8] + w[9];
        int kSum = k[7] + k[8] + k[9];
        System.out.println(wSum + " " + kSum);
    }
}
