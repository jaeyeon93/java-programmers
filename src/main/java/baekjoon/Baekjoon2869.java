package baekjoon;

import java.util.Scanner;

public class Baekjoon2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int current = 0;
        int day = 0;
        while (current <= h) {
            current += a;
            if (current >= h) {
                day++;
                break;
            }
            current -= b;
            day++;
        }
        System.out.println(day);
    }
}
