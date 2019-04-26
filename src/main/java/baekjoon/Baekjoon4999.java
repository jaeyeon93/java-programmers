package baekjoon;

import java.util.Scanner;

public class Baekjoon4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        if (str2.length() > str.length()) {
            System.out.println("no");
            return;
        }
        System.out.println("yes");
    }
}
