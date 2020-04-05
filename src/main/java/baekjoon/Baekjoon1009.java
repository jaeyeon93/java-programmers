package baekjoon;

import java.util.Scanner;

public class Baekjoon1009 {
    private static Integer solution(int a, int b) {
        int result = 1;
        a %= 10;
        while (b > 0) {
            if ((b & 1) == 1)
                result = (result * a) % 10;
            b = b >> 1;
            a = (a * a) % 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String [] input = sc.nextLine().split(" ");
            System.out.println(solution(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }
        int temp = 10;
        temp = temp >> 1;
        System.out.println(temp);
    }
}
