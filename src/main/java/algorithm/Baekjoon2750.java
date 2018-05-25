package algorithm;

import java.util.*;

public class Baekjoon2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++)
            list.add(Integer.parseInt(scanner.nextLine()));
        Collections.sort(list);
        for (Integer i : list)
            System.out.println(i);
    }
}
