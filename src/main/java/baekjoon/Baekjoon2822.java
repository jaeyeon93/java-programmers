package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        for (int i = 3; i < arr.length; i++)
            System.out.print(map.get(arr[i]) + " ");
    }
}
