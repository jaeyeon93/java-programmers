package baekjoon;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/2577
public class Baekjoon2577 {

    public static LinkedHashMap<String, Integer> numbers(List<String> split) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("0", 0);
        map.put("1", 0);
        map.put("2", 0);
        map.put("3", 0);
        map.put("4", 0);
        map.put("5", 0);
        map.put("6", 0);
        map.put("7", 0);
        map.put("8", 0);
        map.put("9", 0);

        for (String num : split) {
            int count = map.get(num);
            map.put(num, ++count);
        }
        return map;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;
        LinkedHashMap<String, Integer> map = numbers(Arrays.asList(String.valueOf(result).split("")));
        for (int i = 0; i <= 9; i++)
            System.out.println(map.get(String.valueOf(i)));
    }
}
