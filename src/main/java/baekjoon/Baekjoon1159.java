package baekjoon;

import java.util.*;

public class Baekjoon1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 97; i < 123; i++)
            map.put((char)(i), 0);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            char c = sc.nextLine().charAt(0);
            int count = map.get(c);
            map.put(c, ++count);
        }
        Iterator<Character> iter = map.keySet().iterator();
        while (iter.hasNext()) {
            char c = iter.next();
            int value = map.get(c);
            if (value >= 5) {
                check = true;
                System.out.print(c);
            }
        }

        if (!check)
            System.out.println("PREDAJA");
    }
}
