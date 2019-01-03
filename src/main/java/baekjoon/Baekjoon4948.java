package baekjoon;

import java.util.Scanner;

public class Baekjoon4948 {
    public static boolean check(int n) {
        for (int i = 2; i*i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static Integer solution(int n) {
        int count = 0;
        for (int i = n+1; i <= 2*n; i++)
            if (check(i))
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            System.out.println(solution(n));
        }
    }
}
