package baekjoon;

import java.util.*;

public class Baekjoon9610 {
    public static Integer check(int x, int y) {
        if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else if (x > 0 && y < 0)
            return 4;
        return 0;
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Q1", 0);
        map.put("Q2", 0);
        map.put("Q3", 0);
        map.put("Q4", 0);
        map.put("AXIS", 0);
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = check(x, y);
            if (result == 1) {
                int temp = map.get("Q1");
                map.put("Q1", ++temp);
            } else if (result == 2) {
                int temp = map.get("Q2");
                map.put("Q2", ++temp);
            } else if (result == 3) {
                int temp = map.get("Q3");
                map.put("Q3", ++temp);
            } else if (result == 4) {
                int temp = map.get("Q4");
                map.put("Q4", ++temp);
            } else if (result == 0) {
                int temp = map.get("AXIS");
                map.put("AXIS", ++temp);
            }
        }

        String [] keys = map.keySet().toArray(new String[map.keySet().size()]);
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i] + ": " + map.get(keys[i]));
        }
    }
}
