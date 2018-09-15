package baekjoon;

import java.util.Scanner;


public class Baekjoon11655 {
    public static String convert(String msg, int shift) {
        String s = "";
        int len = msg.length();
        for (int i = 0; i < len; i++) {
            char c = (char)(msg.charAt(i) + shift);
            if (c > 'z')
                s += (char)(msg.charAt(i) - (26 - shift));
            else
                s += (char)(msg.charAt(i) + shift);
        }
        return s;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = convert(sc.nextLine(), 13);
        System.out.println(result);
    }
}
