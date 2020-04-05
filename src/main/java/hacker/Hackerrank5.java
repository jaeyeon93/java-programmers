package hacker;

import java.util.*;
// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

public class Hackerrank5 {
    static int beautifulDays(int i, int j, int k) {
        List<String> arr = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        for (int m = j; m >= i; m--) {
            String reverse = new StringBuffer(String.valueOf(m)).reverse().toString();
            arr.add(reverse);
        }

        for (int m = j; m >=i; m--)
            arr2.add(m);

        int result = 0;
        for (int m = 0; m < arr.size(); m++) {
            int cal = Math.abs((Integer.parseInt(arr.get(m)) - arr2.get(m)));
            double cal2 = cal * 1.0 / k;
            if (cal2 % 1 == 0)
                result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
