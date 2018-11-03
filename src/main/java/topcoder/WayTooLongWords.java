package topcoder;

import java.util.Scanner;

public class WayTooLongWords {
    public static String solution(String s) {
        if (s.length() < 10)
            return s;
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        builder.append(s.length() - 2);
        builder.append(s.charAt(s.length()-1));
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
            System.out.println(solution(sc.next()));
    }
}
