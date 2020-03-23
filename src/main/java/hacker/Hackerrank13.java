package hacker;

import java.util.*;

// https://www.hackerrank.com/challenges/migratory-birds/problem
public class Hackerrank13 {
    static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer i : arr)
            map.put(i, countList(arr, i));
        int maxValue = Collections.max(map.values());
        return (int)getKeyFromValue(map, maxValue);
    }

    public static int countList(List<Integer> arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++)
            if (arr.get(i) == num)
                count++;
        return count;
    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    public static void main(String[] args) {
//        List<Integer> arr = Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);
        List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
        int result =migratoryBirds(arr);
        System.out.println("result " + result);
    }
}
