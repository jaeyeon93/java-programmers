package algorithm;

import java.util.Scanner;

public class Baekjoon2525 {
    public static String solution(int hour, int minute, int num) {
        int sum = minute+num;
        StringBuilder sb = new StringBuilder();
        if (sum > 59) {
            int div = sum / 60;
            int mod = sum % 60;
            hour += div;
            if (hour > 23) {
                hour %= 24;
                sb.append(hour);
                sb.append(" ");
                sb.append(mod);
                return sb.toString();
            }
            sb.append(hour);
            sb.append(" ");
            sb.append(mod);
            return sb.toString();
        }
        sb.append(hour);
        sb.append(" ");
        sb.append(sum);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int num = sc.nextInt();
        System.out.println(solution(hour, minute, num));
    }
}
