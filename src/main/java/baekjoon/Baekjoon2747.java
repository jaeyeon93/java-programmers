package baekjoon;

import java.util.Scanner;

public class Baekjoon2747 {
    public static Integer pibonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return pibonacci(n-1) + pibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(pibonacci(sc.nextInt()));
    }
}
