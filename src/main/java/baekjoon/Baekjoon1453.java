package baekjoon;

import java.util.Scanner;

public class Baekjoon1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] sit = new boolean[101];
        for (int i = 1; i < 101; i++)
            sit[i] = false;
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            if (sit[input] == true)
                count++;
            else
                sit[input] = true;
        }
        System.out.println(count);
    }
}
