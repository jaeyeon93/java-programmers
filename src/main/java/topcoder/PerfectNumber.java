package topcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 2; i < 5; i++)
            result.addAll(sumK(i, 10));
        System.out.println(result.size());
        System.out.println(result.get(k));
    }

    public static List<Integer> sumK(int n, int sum) {
        int start = (int)Math.pow(10, (n-1));
        int end = (int)Math.pow(10,n);
        List<Integer> list = new ArrayList<>();
        // 10에서 99까지 합이 sum인값.
        for (int i = start; i < end; i++) {
            String [] arr = String.valueOf(i).split("");
            int temp = Arrays.stream(arr).mapToInt(s -> Integer.parseInt(s)).sum();
            if (temp == sum)
                list.add(i);
        }
        return list;
    }
}
