package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int n = sc.nextInt();
            if (n % 2 != 0)
                list.add(n);
        }
        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            int min = Collections.min(list);
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
