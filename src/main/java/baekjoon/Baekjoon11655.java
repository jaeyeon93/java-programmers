package baekjoon;

import java.util.Scanner;


public class Baekjoon11655 {
    public static String convert(String msg) {
        if (msg.charAt(0) >= 'A' && msg.charAt(0) <= 'Z') {
            if (msg.charAt(0)+13 <= 'Z')
                return String.valueOf((char)(msg.charAt(0)+13));
            return String.valueOf((char)(msg.charAt(0)-13));
        } else if (msg.charAt(0) >= 'a' && msg.charAt(0) <= 'z') {
            if (msg.charAt(0)+13 <= 'z')
                return String.valueOf((char)(msg.charAt(0)+13));
            return String.valueOf((char)(msg.charAt(0)-13));
        }
        return msg;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++)
            sb.append(convert(String.valueOf(input.charAt(i))));
        System.out.println(sb.toString());
    }
}
