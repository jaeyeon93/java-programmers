package baekjoon;

import java.util.Scanner;

public class Baekjoon11365 {
    public static String convert(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equals("END"))
                return;
            System.out.println(convert(input));
        }
    }
}
