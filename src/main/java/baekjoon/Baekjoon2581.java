package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2581
public class Baekjoon2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = low; i <= high; i++) {
            if (checkPrime(i)) {
                sum += i;
                list.add(i);
            }
        }
        if (list.size() == 0)
            System.out.println(-1);

        if (list.size() != 0) {
            System.out.println(sum);
            System.out.println(list.get(0));
        }

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
