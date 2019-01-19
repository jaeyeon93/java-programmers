package baekjoon;

import java.util.Scanner;

public class Baekjoon11021 {
    public static Integer solution(int n, int m) {
        return n+m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 1; i <= count; i++)
            System.out.println("Case #" + i + ": " + solution(sc.nextInt(), sc.nextInt()));
    }
}
