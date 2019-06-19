package baekjoon;

import java.util.Scanner;

public class Baekjoon9086 {

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.length() == 1) {
            sb.append(str.charAt(0));
            sb.append(str.charAt(0));
            return sb.toString();
        }
        sb.append(str.charAt(0));
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
            System.out.println(solution(sc.next()));
    }
}
