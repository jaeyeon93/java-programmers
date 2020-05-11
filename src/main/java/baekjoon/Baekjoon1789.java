package baekjoon;

import java.util.Scanner;

public class Baekjoon1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long count = 1;
        long sum = 1;

        while (sum < s) {
            count++;
            sum += count;
            if (sum > s) {
                count--;
            }
        }
        System.out.println(count);
    }
}
