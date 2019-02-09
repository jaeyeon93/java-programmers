package baekjoon;

import java.util.*;

public class Baekjoon2751 {
    public static List<Integer> sort(List<Integer> list) {
        if (list.size() < 2)
            return list;

        int pivot = list.get(0);
        List<Integer> lower = new ArrayList<>();
        List<Integer> higher = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                lower.add(list.get(i));
            } else {
                higher.add(list.get(i));
            }
        }
        List<Integer> sorted = sort(lower);
        sorted.add(pivot);
        sorted.addAll(sort(higher));
        return sorted;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
            list.add(sc.nextInt());
        List<Integer> result = sort(list);
        for (Integer i : result)
            System.out.println(i);
    }

}
