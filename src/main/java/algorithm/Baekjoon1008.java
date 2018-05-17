package algorithm;

import java.util.Scanner;

public class Baekjoon1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = scanner.nextInt();
        Integer num2 = scanner.nextInt();
        double result = (double)num1 / (double)num2;
        System.out.println(result);
    }
}
