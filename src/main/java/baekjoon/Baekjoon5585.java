package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon5585 {
    public static Integer solution(List<Integer> list, int n) {
        int count = 0;
        while (n != 0) {
            for (Integer i : list) {
                count += n / i;
                n %= i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1000 - sc.nextInt();
        List<Integer> list = Arrays.asList(500, 100, 50,10, 5, 1);
        System.out.println(solution(list, n));
    }
}
