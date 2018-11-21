package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int match = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
            list.add(sc.nextInt());
        int result = solution(list, match);
        System.out.println(result);
    }

    public static Integer solution(List<Integer> list, int match) {
        List<Integer> lengths = new ArrayList<>();
        int sum = 0;
        int i = 0, j = 0;
        while (i <= j && j < list.size()) {
            if (sum < match) {
                sum += list.get(j++);
            } else {
                sum -= list.get(i++);
            }
            if (sum == match) {
                lengths.add((j-i));
            }
        }

        if (lengths.size() == 0)
            return 0;
        return Collections.min(lengths);
    }
}
