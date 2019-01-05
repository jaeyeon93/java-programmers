package baekjoon;

import java.util.*;
import java.util.stream.Collectors;

// https://www.acmicpc.net/problem/1157
public class Baekjoon1157 {

    public static String solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 65; i < 91; i++)
            map.put(String.valueOf((char)i), 0);

        List<String> list = Arrays.asList(s.toUpperCase().split(""));

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).toUpperCase();
            int count = map.get(str);
            map.put(list.get(i) , ++count);
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result = solution(sc.nextLine());
        System.out.println(result);
    }
}
