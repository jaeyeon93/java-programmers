package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon15649 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        pick(Integer.parseInt(input[0]), list,Integer.parseInt(input[1]));
    }

    public static void print(List<Integer> list) {
        for (int i : list)
            System.out.print(i + " ");
    }

    static void pick(int n, List<Integer> picked, int toPick) {
        if (toPick == 0) {
            print(picked);
            System.out.println();
            return;
        }

        for (int next = 1; next <= n; next++) {
            if (picked.contains(next)) continue;
            picked.add(next);
            pick(n, picked, toPick-1);
            picked.remove(picked.size()-1);
        }
    }
}
