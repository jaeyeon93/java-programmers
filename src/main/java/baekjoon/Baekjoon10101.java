package baekjoon;

import java.util.Scanner;

public class Baekjoon10101 {
    public static String solution(int first, int second, int third) {
        if (first == 60 && second == 60 && third == 60)
            return "Equilateral";

        if (first + second + third != 180)
            return "Error";

        if (first != second && second != third && third != first)
            return "Scalene";
        return "Isosceles";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        System.out.println(solution(first, second, third));
    }
}
