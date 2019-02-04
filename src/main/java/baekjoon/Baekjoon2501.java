package baekjoon;

import java.util.ArrayList;
import java.util.List;

public class Baekjoon2501 {
    public static Integer solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                list.add(i);
        return list.get(k-1);
    }
    public static void main(String[] args) {
        System.out.println(solution(6,3));
    }
}
