package codility;

import java.util.HashMap;
import java.util.Map;

//https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
public class OddOccurencesInArray {
    public static int solution(int [] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], 0);

        for (int i = 0; i < arr.length; i++) {
            int count = map.get(arr[i]);
            if (map.containsKey(arr[i]))
                map.put(arr[i], ++count);
        }
        return getKey(map, 1);
    }

    public static  <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] arr = {9,3,9,3,9,7,9};
        int reuslt = solution(arr);
        System.out.println(reuslt);
    }
}
