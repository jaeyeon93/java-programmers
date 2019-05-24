package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            list.add(sc.nextInt());
        Collections.sort(list);
        for (Integer i : list)
            System.out.print(i + " ");
    }
}
