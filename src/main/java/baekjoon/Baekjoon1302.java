package baekjoon;

import java.util.*;

public class Baekjoon1302 {
    private static Map<String, Integer> map = new HashMap<>();
    private static String result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (map.containsKey(input)) {
                int count = map.get(input);
                map.put(input, ++count);
            } else
                map.put(input, 1);
        }

        for (String s : map.keySet())
            max = Math.max(max, map.get(s));

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        for (String str : list)
            if (map.get(str) == max) {
                System.out.println(str);
                break;
            }
    }
}
