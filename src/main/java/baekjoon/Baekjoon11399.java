package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/11399
public class Baekjoon11399 {
    public static Integer solution(List<Integer> list) {
        Collections.sort(list);
        List<Integer> sums = new ArrayList<>();
        int sum = 0;
        int result = 0;

        for (int i = 0; i < list.size(); i++) {
            int temp = sum += list.get(i);
            sums.add(temp);
            result += temp;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        System.out.println(solution(list));
    }
}
