package baekjoon;

import java.util.Scanner;

public class Baekjoon1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        int length = 10;
        int digit = 1;
        for (int i = 1; i <= n; i++) {
            if (i == length) {
                digit++;
                length *= 10;
            }
            result += digit;
        }
        System.out.println(result);
    }
}
