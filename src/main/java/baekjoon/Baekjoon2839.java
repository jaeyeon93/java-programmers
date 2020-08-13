package baekjoon;

import java.util.Scanner;

public class Baekjoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (true) {
            if (n % 5 == 0) {
                int div = n / 5;
                count += div;
                n %= 5;
            } else {
                n -= 3;
                count++;
            }
            if (n <= 0)
                break;
        }

        if (n == 0)
            System.out.println(count);
        else if (n < 0)
            System.out.println(-1);
    }
}
