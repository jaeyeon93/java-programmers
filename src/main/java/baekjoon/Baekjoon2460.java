package baekjoon;

import java.util.Scanner;

public class Baekjoon2460 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            sum -= sc.nextInt();
            sum += sc.nextInt();
            if (sum > max)
                max = sum;
        }

        System.out.println(max);
    }
}
