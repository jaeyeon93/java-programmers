package baekjoon;

import java.util.*;

// https://www.acmicpc.net/problem/1157
public class Baekjoon1157 {

    public static Integer solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 65; i < 91; i++)
            map.put(String.valueOf((char)i), 0);
        List<String> list = Arrays.asList(s.toUpperCase().split(""));
        for (int i = 0; i < list.size(); i++) {
            int count = map.get(i);
            map.put(list.get(i) , ++count);
        }
        int result = map.get(list.get(0));

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = solution(sc.nextLine());
    }
}
