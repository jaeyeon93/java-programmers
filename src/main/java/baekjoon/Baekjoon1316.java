package baekjoon;

import java.util.*;

public class Baekjoon1316 {
    public static Boolean check(String str) {
        List<String> list = Arrays.asList(str.split(""));
        Set<String> set = new HashSet<>(list);
        Map<String, Integer> map = new HashMap<>();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
            map.put(itr.next(), 0);
        for (String s : list) {
            int count = map.get(s);
            map.put(s, ++count);
        }
        System.out.println(map);

        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            String currnet = itr.next();

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check("aaabbb"));
    }
}
