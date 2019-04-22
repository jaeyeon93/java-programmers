package baekjoon;

import java.util.Scanner;

public class Baekjoon2480 {
    public static Integer solution(int a, int b, int c) {
        if (a == b && b == c)
            return 10000+(a*1000);
        else if (a != b && b != c && c != a) {
            if (a > b && a > c)
                return a*100;
            else if (b > c && b > a)
                return b*100;
            return c*100;
        }

        // 2개가 같을때
        if (a == b && b != c)
            return 1000+a*100;
        else if (b == c && c != a)
            return 1000+b*100;
        return 1000+c*100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));
    }
}
