package baekjoon;

import java.util.Scanner;

public class Baekjoon10886 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int people = sc.nextInt();
        int non = 0;
        int cute = 0;
        for (int i = 0; i < people; i++) {
            int num = sc.nextInt();
            if (num == 0)
                ++non;
            else
                ++cute;
        }

        if (non > cute) {
            System.out.println("Junhee is not cute!");
            return;
        }
        System.out.println("Junhee is cute!");
    }
}
