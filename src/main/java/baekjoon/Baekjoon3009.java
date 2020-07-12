package baekjoon;

import java.util.*;

public class Baekjoon3009 {
    public static int solution(Map<Integer, Integer> map) {
       Iterator<Integer> itr = map.keySet().iterator();
       int point = 0;
       while (itr.hasNext()) {
        int key = itr.next();
        if (map.get(key) == 1) {
            point = key;
            break;
        }
       }
       return point;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> xList = new HashMap<>();
        Map<Integer, Integer> yList = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (xList.keySet().contains(x)) {
                int count = xList.get(x);
                count++;
                xList.put(x, count);
            } else
                xList.put(x, 1);

            if (yList.keySet().contains(y)) {
                int count = yList.get(y);
                count++;
                yList.put(y, count);
            } else
                yList.put(y, 1);
        }
        System.out.println(solution(xList) + " " + solution(yList));
    }
}
