package hacker;

import java.util.Scanner;
// https://www.hackerrank.com/challenges/pangrams/problem
public class Pangrams {
    public static String check(String s) {
        String convert = s.toLowerCase();
        for (int i = 97; i <= 122; i++)
            if (!convert.contains(String.valueOf((char)i)))
                return "not pangram";
        return "pangram";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(check(input));
    }
}
