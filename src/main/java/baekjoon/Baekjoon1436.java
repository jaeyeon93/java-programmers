package baekjoon;

import java.util.*;

public class Baekjoon1436 {
    private static List<Integer> list = new ArrayList<>();
    private static Set<Integer> set = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 0;
        int count = 0;
        while (count != n) {
            number++;
            if (String.valueOf(number).contains("666")) {
                count++;
            }
        }
        System.out.println(number);
    }
}
