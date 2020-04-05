package baekjoon;

import java.util.*;

public class Baekjoon2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], i+1);
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 3; i < arr.length; i++)
            sum += arr[i];

        System.out.println(sum);
        List<Integer> result = new ArrayList<>();
        for (int i = 3; i < arr.length; i++)
            result.add(map.get(arr[i]));
        Collections.sort(result);
        for (Integer i : result)
            System.out.print(i + " ");
    }
}
