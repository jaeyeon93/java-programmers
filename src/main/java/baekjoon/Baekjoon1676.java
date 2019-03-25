package baekjoon;

import java.util.Scanner;

public class Baekjoon1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long mul = 1;
        int two = 0;
        int five = 0;

        for (int i = 2; i <= n; i++) {
            mul *= i;
            if (mul % 2  == 0) {
                ++two;
                mul /= 2;
            }

            if (mul % 5 == 0) {
                ++five;
                mul /= 5;
            }
        }


        if (two <= five) {
            System.out.println(two);
        } else {
            System.out.println(five);
        }
    }
}
