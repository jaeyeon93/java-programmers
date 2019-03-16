package baekjoon;

import java.util.*;
import java.util.stream.Collectors;

public class Baekjoon10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
           list.add(sc.nextInt());
        List<Integer> result = new ArrayList<>();
        int x = 0;
//        while (x < list.size()) {
//            for (Integer i : list)
//                if (!result.contains(i))
//                    result.add(i);
//            x++;
//        }
        while (x < list.size()) {
            result = list.parallelStream().distinct().collect(Collectors.toList());
            x++;
        }
        Collections.sort(result);
        for (Integer i : result)
            System.out.print(i + " ");
    }
}
