package programmers;

import java.util.Scanner;

public class Pg12969 {
    public static String solution(int a) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < a; i++)
            builder.append("*");
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++)
            System.out.println(solution(a));
    }
}
