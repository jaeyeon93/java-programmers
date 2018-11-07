package baekjoon;

import java.util.Scanner;

public class Baekjoon1297 {
    public static int solution(int input) {
        if (input % 4 == 0 && input % 100 != 0 || input % 400 == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int d = 52;
        int h = 9;
        int w = 16;
        int x = d^2 / (h^2 + w^ 2);
        double x1 = Math.sqrt((double)x);
        System.out.println("x : " + x1);
    }
}
