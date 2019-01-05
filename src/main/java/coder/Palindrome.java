package coder;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 4 == 1 || i % 4 == 2)
                System.out.print("a");
            if (i % 4 == 0 || i % 4 == 3)
                System.out.print("b");
        }
        System.out.println();
    }
}
