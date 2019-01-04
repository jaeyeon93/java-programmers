package baekjoon;

import java.util.Scanner;

public class Baekjoon1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, ans = 0, sum;
        ans = n;
        while (true) {
            int x = n / 10;
            int y = n % 10;
            sum = (x+y) % 10;
            n = y * 10 + sum;
            count++;
            if (ans == n)
                break;
        }
        System.out.println(count);
    }
}
