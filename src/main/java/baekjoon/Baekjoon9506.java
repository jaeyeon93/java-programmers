package baekjoon;

import java.util.*;
// https://www.acmicpc.net/problem/9506
public class Baekjoon9506 {
    public static Set<Integer> solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        return set;
    }

    public static String check(Set<Integer> set, int n) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        Integer [] arr = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.asList(arr));
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++)
            sum += arr[i];
        if (sum != n) {
            sb.append(n);
            sb.append(" is NOT perfect.");
            return sb.toString();
        }
        sb.append(n);
        sb.append(" = ");
        for (int i = 0; i < arr.length-2; i++)
            sb.append(arr[i] + " + ");
        sb.append(arr[arr.length-2]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == -1)
                break;
            System.out.println(check(solution(n), n));
        }
    }
}
