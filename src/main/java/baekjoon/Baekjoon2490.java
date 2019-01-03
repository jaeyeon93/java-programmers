package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2490 {
    public static String solution(List<Integer> list) {
        int count = 0;
        for (Integer i : list)
            if (i == 0)
                count++;

        if (count == 1)
            return "A";

        if (count == 2)
            return "B";

        if (count == 3)
            return "C";

        if (count == 4)
            return "D";

        return "E";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 4; j++)
                list.add(sc.nextInt());
            System.out.println(solution(list));
        }

    }
}
