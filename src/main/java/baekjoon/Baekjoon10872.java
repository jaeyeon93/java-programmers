package baekjoon;

import java.util.Scanner;

public class Baekjoon10872 {
    public static Integer solution(int n) {
        if (n == 0)
            return 1;
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
}
