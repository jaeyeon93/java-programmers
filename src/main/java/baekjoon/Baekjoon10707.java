package baekjoon;

import java.util.Scanner;

public class Baekjoon10707 {
    public static Integer solution(int b, int c, int d, int p) {
        if (p <= c)
            return b;
        return (p-c)*d+b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(Math.min(solution(b,c,d,p), a*p));
    }
}
