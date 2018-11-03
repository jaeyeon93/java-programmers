package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1712
public class Baekjoon1712 {
    public static Integer solution(int a, int b, int c) {
        if (c <= b)
            return -1;
        return a/(c-b) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = solution(a,b,c);
        System.out.println(result);
    }
}
