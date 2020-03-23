package hacker;

import java.util.*;

public class Hackerrank10 {
//    https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
    static String hackerrankInString(String s) {
        String str = "ahcker rank";
        if (str.length() > s.length())
            return "NO";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (count < str.length() && s.charAt(i) == str.charAt(count))
                count++;
        }
        return (count == str.length() ? "YES" : "NO");
    }

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = hackerrankInString(s);
            System.out.println(result);
        }
        in.close();
    }
}
