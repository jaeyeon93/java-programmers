package baekjoon;

import java.util.Scanner;

public class Baekjoon2675 {
    public static String solution(int n, String str) {
        StringBuilder sb = new StringBuilder();
        String [] arr = str.split("");
        for (String s : arr)
            for (int i = 0; i < n; i++)
                sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int repeat = sc.nextInt();
            String str = sc.next();
            System.out.println(solution(repeat, str));
        }
    }
}
