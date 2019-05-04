package baekjoon;

import java.util.Scanner;

public class Baekjoon7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = 10;
        for (int i = 0; i < str.length()-1; i++)
            if (str.charAt(i) == str.charAt(i+1))
                result += 5;
            else
                result += 10;
        System.out.println(result);
    }
}
