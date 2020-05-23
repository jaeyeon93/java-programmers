package baekjoon;

import java.util.Scanner;

public class Baekjoon2231 {
    public static int getGenerator(int num) {
        int result = 0;
        result += num;
        while (num != 0) {
            int div = num % 10;
            result += div;
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (getGenerator(i) == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}
