package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon3047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[3];
        for (int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        Map<String, Integer> map = new HashMap<>();
        map.put("A", arr[0]);
        map.put("B", arr[1]);
        map.put("C", arr[2]);
        String str = sc.next();
        String [] split = str.split("");
        for (String s : split)
            System.out.print(map.get(s) + " ");
    }
}
