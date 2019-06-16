package baekjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon2745 {
    public static Integer solution(String number, int n, Map<String, Integer> map) {
        int result = 0;
        for (int i = number.length()-1; i >= 0; i--) {
            int value = map.get(String.valueOf(number.charAt(i)));
            result += value * Math.pow(n, number.length()-1-i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 2; i < n; i++) {
            if (i < 10)
                map.put(String.valueOf(i), i);
            else {
                char ch = (char)(i+55);
                map.put(String.valueOf(ch), i);
            }
        }
        System.out.println(solution(number, n, map));
    }
}
