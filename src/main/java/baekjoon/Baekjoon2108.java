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

        // 배열에 중복요소 제거하고 Set에 넣기
        Set<Integer> set = new HashSet<>(list);
        Iterator<Integer> itr = set.iterator();
        Map<Integer, Integer> map = new HashMap<>();

        // set에 있는 요소들 순회하면서 map에 key값, value 0으로 매핑하기
        while (itr.hasNext())
            map.put(itr.next(), 0);

        // value값 다시 매핑하기
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

        // 최빈값을 찾았으면 최빈값이 같은 경우가 있을 수 있어서 리스트에 담기
        List<Integer> sameValues = new ArrayList<>();
        itr = map.keySet().iterator();
        while (itr.hasNext()) {
            int key = itr.next();
            if (map.get(key) == manyCount)
                sameValues.add(key);
        }
        Collections.sort(sameValues);

        // 만약에 최빈값이 1개이면 그냥 리턴. 최빈값이 같은개 여러개면 정렬 후 index 1인값 리턴
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
