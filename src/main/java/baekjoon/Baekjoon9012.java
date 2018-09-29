package baekjoon;

import java.util.Scanner;

public class Baekjoon9012 {
    public static String check(String s) {
        s.trim();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            else
                count--;

            if (count < 0)
                return "NO";
        }

        if (count == 0)
            return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println(check(sc.nextLine()));
        }
    }
}
