package baekjoon;

import java.util.Scanner;

public class Baekjoon5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 4; i++)
            total += sc.nextInt();

        int minute = total / 60;
        int second = total % 60;
        System.out.println(minute);
        System.out.println(second);
    }
}
