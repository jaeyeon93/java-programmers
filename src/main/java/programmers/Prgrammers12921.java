package programmers;

import java.util.Scanner;

public class Prgrammers12921 {
    public static boolean check(int n) {
        System.out.println("전달받은 n : " + n);
        for (int i = 2; i*i <= n; i++)
            if ((n/i) == 0)
                return false;
            return true;
    }

    public static int solution(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {

        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(2));
        System.out.println(check(3));
        System.out.println(check(4));
        System.out.println(check(5));
        System.out.println(check(7));

    }
}
