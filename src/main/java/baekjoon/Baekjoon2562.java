package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 9; i++)
            list.add(sc.nextInt());
        int max = Collections.max(list);
        System.out.println(max);
        System.out.println(list.indexOf(max)+1);
    }
}
