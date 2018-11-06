package baekjoon;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1085
public class Baekjoon1085 {
    public static int solution(int x, int y, int w, int h) {
        int temp1 = Math.min(x, Math.abs(w-x));
        int temp2 = Math.min(y, Math.abs(h-y));
        return Math.min(temp1, temp2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(solution(x, y, w, h));
    }
}
