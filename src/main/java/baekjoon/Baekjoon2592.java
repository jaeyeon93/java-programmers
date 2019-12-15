package baekjoon;

import java.util.*;

public class Baekjoon2592 {
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

        for (Integer i : list) {
            int count = map.get(i);
            map.put(i, ++count);
        }

        Integer max_value = Collections.max(map.values());
        Integer max = 0;
        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            if (map.get(itr.next()) == max_value) {
                max = map.get(itr.next());
                break;
            }
        }
        System.out.println(average);
        System.out.println(max);
    }
}

// 1 2 2 2 2 3 3 3 4 4