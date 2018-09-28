package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1978
public class Baekjoon1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (checkPrime(sc.nextInt()))
                count++;
        }
        System.out.println(count);
    }

    public static boolean checkPrime(int number) {
        if (number == 1)
            return false;

        for (int i = 2; i*i <= number; i++)
            if (number % i == 0)
                return false;
        return true;
    }
}
