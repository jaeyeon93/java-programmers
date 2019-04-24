package baekjoon;

import java.util.Scanner;


public class Baekjoon11655 {
//    public static String convert(String msg, int shift) {
//        String s = "";
//        int len = msg.length();
//        for (int i = 0; i < len; i++) {
//            char c = (char)(msg.charAt(i) + shift);
//            if (c > 'z')
//                s += (char)(msg.charAt(i) - (26 - shift));
//            else
//                s += (char)(msg.charAt(i) + shift);
//        }
//        return s;
//    }

    public static String convert(String str) {
        int s = (int)str.charAt(0);
        if (s >= 65 && s <= 90) {
            if (s+13 > 90)
                return String.valueOf(s-13);
            s += 13;
            return String.valueOf(s);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convert("A"));
        System.out.println(convert("B"));
        System.out.println(convert("W"));
        System.out.println(convert("X"));
    }
}
