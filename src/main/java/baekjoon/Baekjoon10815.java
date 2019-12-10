package baekjoon;
// https://www.acmicpc.net/problem/10815

import java.util.*;
public class Baekjoon10815 {
    public static List<Integer> solution(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> result = new ArrayList<>();
        Iterator<Integer> itr = set2.iterator();
        while (itr.hasNext()) {
            if (set1.contains(itr.next()))
                result.add(1);
            else
                result.add(0);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        for (int i = 0; i < n; i++)
            set1.add(sc.nextInt());
        int m = sc.nextInt();
        for (int i = 0; i < m; i++)
            set2.add(sc.nextInt());
        List<Integer> result = solution(set1, set2);
        for (Integer i : result)
            System.out.print(i + " ");
    }
}