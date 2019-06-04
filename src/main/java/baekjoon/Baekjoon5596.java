package baekjoon;

import java.util.Scanner;

public class Baekjoon5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 0;
        for (int i = 0; i < 4; i++)
            first += sc.nextInt();

        for (int i = 0; i < 4; i++)
            second += sc.nextInt();

        if (first == second)
            System.out.println(first);
        else
            System.out.println(Math.max(first, second));
    }
}
