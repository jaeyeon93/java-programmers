package baekjoon;

import java.util.Scanner;

public class Baekjoon1748 {
    public static Integer solution(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++)
            num += Math.log10(i)+1;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
