package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10797 {
    public static Integer solution(int day, List<Integer> list) {
        int count = 0;
        for (Integer i : list)
            if (i == day)
                count++;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list.add(sc.nextInt());
        int result = solution(day, list);
        System.out.println(result);
    }
}
