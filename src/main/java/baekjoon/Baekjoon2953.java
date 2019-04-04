package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++)
                sum += sc.nextInt();
            list.add(sum);
        }
        int max = Collections.max(list);
        System.out.println(list.indexOf(max)+1 + " " + max);
    }
}
