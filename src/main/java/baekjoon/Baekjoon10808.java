package baekjoon;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 97; i < 123; i++)
            map.put((char)i, 0);
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            int count = map.get(str.charAt(i));
            map.put(str.charAt(i), ++count);
        }

        for (int i = 97; i < 123; i++)
            System.out.print(map.get((char)i) + " ");
    }
}
