package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon2108 {
    public static int getAvg(List<Integer> list) {
        double sum = 0;
        for (int i : list)
            sum += i;

        sum /= list.size();
        return  (int)Math.round(sum);
    }

    public static int many(List<Integer> list) {
        int manyCount = 0;
        Set<Integer> set = new HashSet<>(list);
        Iterator<Integer> itr = set.iterator();
        Map<Integer, Integer> map = new HashMap<>();
        while (itr.hasNext())
            map.put(itr.next(), 0);

        for (int i : list) {
            int count = map.get(i);
            map.put(i, ++count);
        }

        // Map순회하면서 최빈값을 찾기
        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            int temp = map.get(key);
            if (temp > manyCount)
                manyCount= temp;
        }
        List<Integer> sameValues = new ArrayList<>();
        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            if (map.get(key) == manyCount)
                sameValues.add(key);
        }
        Collections.sort(sameValues);
        if (sameValues.size() == 1)
            manyCount = sameValues.get(0);
        else
            manyCount = sameValues.get(1);
        return manyCount;
    }

    public static int getMid(List<Integer> list) {
        if (list.size() == 1)
            return list.get(0);
        int mid = list.size()/2;
        return list.get(mid);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(Integer.parseInt(br.readLine()));
        Collections.sort(list);
        System.out.println(getAvg(list));
        System.out.println(getMid(list));
        System.out.println(many(list));
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max-min);

    }
}
