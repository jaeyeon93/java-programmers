package baekjoon;

import java.util.Scanner;

public class Baekjoon1834 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 0;
        for (long i = 0; i < n; i++)
            result += n*i + i;
        System.out.println(result);
    }
}
