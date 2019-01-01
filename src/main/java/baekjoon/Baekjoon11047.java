package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11047
public class Baekjoon11047 {
    public static Integer solution(int n, List<Integer> list) {
        int count = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (n / list.get(i) != 0) {
                count += n / list.get(i);
                n = n % list.get(i);
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        int count = solution(m, list);
        System.out.println(count);
    }
}
