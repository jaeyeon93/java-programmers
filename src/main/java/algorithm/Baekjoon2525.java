package algorithm;

import java.util.Scanner;

public class Baekjoon2525 {
    public static void solution(int hour, int minute, int num) {
        if (minute + num >= 60) {
            hour += (minute + num) / 60;
            if (hour >= 24)
                System.out.println((hour - 24) + " " + (60 - minute));

            if (hour < 24)
                System.out.println((hour) + " " + (60-minute));
        }

        if (minute + num < 60)
            System.out.println((hour) + " " +(minute + num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int num = sc.nextInt();
        solution(hour, minute, num);
    }
}
