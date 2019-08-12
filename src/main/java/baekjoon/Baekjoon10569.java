package baekjoon;

import java.util.Scanner;

public class Baekjoon10569 {
    public static Integer solution(int v, int e) {
        return (2 + e - v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(solution(sc.nextInt(), sc.nextInt()));
    }
}
