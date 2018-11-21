package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10986 {
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
        int sum = 0;
        int count = 0;
        int i = 0, j = 0;
        while (i <= j && j < list.size()) {
            if (sum < match) {
                sum += list.get(j++);
            } else {
                sum -= list.get(i++);
            }
            if (sum % match == 0)
                count++;

        }
        return count;
    }
}
