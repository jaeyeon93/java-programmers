package baekjoon;

import java.util.Scanner;

public class Baekjoon10833 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int student = sc.nextInt();
            int apple = sc.nextInt();
            sum += (apple % student);
        }
        System.out.println(sum);
    }
}
