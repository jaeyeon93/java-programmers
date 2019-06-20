package baekjoon;

import java.util.*;

public class Baekjoon2501 {
    public static Set<Integer> solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n/2; i++)
            if (n % i == 0) {
                set.add(i);
                set.add(n/i);
            }
        return set;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> set = solution(n);
        Integer [] arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
