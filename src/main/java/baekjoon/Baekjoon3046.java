package baekjoon;

import java.util.Scanner;

public class Baekjoon3046 {
    public static int solution(int r1, int s) {
        return 2*s-r1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("result : " + solution(r1, s));
    }
}
