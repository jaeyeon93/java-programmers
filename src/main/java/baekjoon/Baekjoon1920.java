package baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon1920 {
    public static Integer solution(List<Integer> list, int n) {
        int mid;
        int left = 0;
        int right = list.size() - 1;
        while (right >= left) {
            mid = (right + left) / 2;
            if (n == list.get(mid))
                return 1;

            if (n < list.get(mid)) {
                right = mid - 1;
            } else {
                left = mid +1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());
        Collections.sort(list);

        int searchNum = sc.nextInt();
        for (int i = 0; i < searchNum; i++)
            System.out.println(solution(list, sc.nextInt()));
    }
}
