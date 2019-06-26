package baekjoon;

import java.util.Scanner;

public class Baekjoon2476 {
    public static Integer solution(int a, int b, int c) {
        if (a == b && b == c)
            return 10000+(a*1000);
        else if (a != b && b != c && c != a)
            return Math.max(Math.max(a, b), Math.max(b, c)) * 100;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = 0;
        for (int i = 0; i < t; i++) {
            int temp = solution(sc.nextInt(), sc.nextInt(), sc.nextInt());
            if (temp > max)
                max = temp;
        }
        System.out.println(max);

    }
}
