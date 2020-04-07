package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// https://www.acmicpc.net/problem/10868
public class Baekjoon10868 {
    public static Integer solution(List<Integer> list, int a, int b) {
        int min = list.get(a-1);
        for (int i = a-1; i < b; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++)
            list.add(sc.nextInt());

        for (int i = 0; i < n; i++)
            System.out.println(solution(list, sc.nextInt(), sc.nextInt()));
    }
}