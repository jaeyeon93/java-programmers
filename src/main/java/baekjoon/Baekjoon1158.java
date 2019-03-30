package baekjoon;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Baekjoon1158 {
    public static List<Integer> solution(List<Integer> list, int n) {
        int pop = list.get(n);
        list.remove(n);
        list.add(pop);
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 7; i++)
            list.add(i);

        for (int i = 0; i < 7; i++)
            System.out.println(solution(list, 2));
    }
}
