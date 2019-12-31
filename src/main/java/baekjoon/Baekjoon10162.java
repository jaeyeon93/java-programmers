package baekjoon;

import java.util.Scanner;

public class Baekjoon10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            if (t >= 300) {
                a += (t/300);
                t %= 300;
            } else if (t >= 60) {
                b += (t/60);
                t %= 60;
            } else if (t >= 10) {
                c += (t/10);
                t %= 10;
                if (t < 10 && t != 0) {
                    System.out.println(-1);
                    break;
                }
            }

            if (t == 0) {
                System.out.println(a + " " + b + " " + c);
                break;
            }
        }
    }
}
