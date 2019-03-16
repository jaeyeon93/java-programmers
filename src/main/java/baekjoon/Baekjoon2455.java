package baekjoon;

import java.util.Scanner;

public class Baekjoon2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 0;
        int max = current;
        for (int i = 0; i < 4; i++) {
            current -= sc.nextInt();
            current += sc.nextInt();
            if (current > max)
                max = current;
        }
        System.out.println(max);
    }
}
