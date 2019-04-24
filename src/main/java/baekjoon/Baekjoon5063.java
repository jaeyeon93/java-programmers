package baekjoon;

import java.util.Scanner;

public class Baekjoon5063 {
    public static String solution(int r, int e, int c) {
        if (e-c > r)
            return "advertise";
        else if (e-c == r)
            return "does not matter";
        return "do not advertise";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));

    }
}
