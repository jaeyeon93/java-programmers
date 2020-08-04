package kakao;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KakaoBlind2018Cache {
    public static int solution(int cacheSize, String [] cities) {
        List<String> cache = new LinkedList<>();
        int time = 0;
        if (cacheSize == 0)
            return cities.length*5;

        for (String city : cities) {
            city = city.toLowerCase();
            if (cache.contains(city)) { // cache hit
                String tmp = cache.remove(cache.indexOf(city));
                cache.add(tmp);
                time++;
            } else {
                if (cache.size() == cacheSize) {
                    cache.remove(0);
                    cache.add(city);
                    time += 5;
                } else {
                    cache.add(city);
                    time += 5;
                }
            }
        }
        return time;
    }

    public static void main(String[] args) {
        // test1
        System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
        // test2
        System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
        // test3
        System.out.println(solution(2, new String [] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
        // test4
        System.out.println(solution(5, new String [] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));

        // test5
        System.out.println(solution(2, new String[] {"Jeju","Pangyo","NewYork","newyork"}));
        // test6
        System.out.println(solution(0, new String [] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));

    }
}
