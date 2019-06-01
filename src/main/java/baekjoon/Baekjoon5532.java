package baekjoon;

import java.util.Scanner;

public class Baekjoon5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int korean = sc.nextInt();
        int math = sc.nextInt();
        int korean_page = sc.nextInt();
        int math_page = sc.nextInt();
        int korean_day;
        int math_day;
        if (korean % korean_page != 0)
            korean_day = korean/korean_page + 1;
        else
            korean_day = korean/korean_page;

        if (math % math_page != 0)
            math_day = math/math_page + 1;
        else
            math_day = math/math_page;

        if (math_day > korean_day) {
            System.out.println(day - math_day);
            return;
        } else {
            System.out.println(day - korean_day);
        }
    }
}
