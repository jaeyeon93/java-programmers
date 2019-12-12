package baekjoon;

import java.util.Scanner;

public class Baekjoon2884 {
    public static String solution(int h, int m) {
        StringBuilder sb = new StringBuilder();
        if (m >= 45) {
            sb.append(h);
            sb.append(" ");
            sb.append(m - 45);
            return sb.toString();
        }

        if (h == 0) {
            sb.append(23);
            sb.append(" ");
            sb.append((m+15) % 60);
            return sb.toString();
        }
        sb.append(h - 1);
        sb.append(" ");
        sb.append((m+15) % 60);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solution(h, m));
    }
}
