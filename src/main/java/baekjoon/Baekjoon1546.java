package baekjoon;

import java.util.*;

// https://www.acmicpc.net/problem/1546
public class Baekjoon1546 {
    public static double solution(List<Integer> list) {
        int max = Collections.max(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++)
            sum += ((double)list.get(i)/max)*100;
        double result = sum / list.size();
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
            list.add(sc.nextInt());
        System.out.println(solution(list));
    }
}
