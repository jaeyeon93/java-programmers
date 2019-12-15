package baekjoon;

import java.util.*;

// https://www.acmicpc.net/problem/2592
public class Baekjoon2592 {
    public static Integer solution(Map<Integer, Integer> map) {
        Integer max_value = Collections.max(map.values());
        Integer max = 0;
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            int value = map.get(key);
            if (max_value == value) {
                max = key;
                break;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(sc.nextInt());

        int sum = 0;
        for (Integer i : list)
            sum += i;
        int average = sum / 10;


        Set<Integer> set = new HashSet<>(list);
        Map<Integer, Integer> map = new HashMap();
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext())
            map.put(itr.next(), 0);
        itr.remove();
        for (Integer i : list) {
            int count = map.get(i);
            map.put(i, ++count);
        }


        System.out.println(average);
        System.out.println(solution(map));
    }
}