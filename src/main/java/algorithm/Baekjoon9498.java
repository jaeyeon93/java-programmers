package algorithm;

import java.util.Scanner;

public class Baekjoon9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 90 && num <= 100)
            System.out.println("A");

        if (num >= 80 && num <= 89)
            System.out.println("B");

        if (num >= 70 && num <= 79)
            System.out.println("C");

        if (num >= 60 && num <= 69)
            System.out.println("D");

        if (num >= 0 && num < 60)
            System.out.println("F");
    }
}
