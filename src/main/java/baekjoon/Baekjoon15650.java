package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon15650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        solution(Integer.parseInt(input[0]), list,Integer.parseInt(input[1]));
    }

    public static void print(List<Integer> list) {
        for (int i : list)
            System.out.print(i + " ");
    }

    public static void solution(int n, List<Integer> list, int toPick) {
        if (toPick == 0) {
            print(list);
            System.out.println();
            return;
        }

        int smallest = list.isEmpty() ? 1 : list.get(list.size()-1)+1;

        for (int next = smallest; next <= n; next++) {
            list.add(next);
            solution(n, list, toPick-1);
            list.remove(list.size()-1);
        }
    }
}
