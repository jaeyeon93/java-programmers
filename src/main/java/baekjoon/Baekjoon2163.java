package baekjoon;

import java.util.Scanner;

public class Baekjoon2163 {
    public static Integer solution(int n, int m) {
        int result = (m-1) + m*(n-1);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(n, m));
    }
}
