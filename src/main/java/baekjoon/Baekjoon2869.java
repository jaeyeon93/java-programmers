package baekjoon;

import java.util.Scanner;

public class Baekjoon2869 {
    public static Integer solution(int a, int b, int h) {
        return (h-a)/(a-b) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(solution(a, b, h));
    }
}
