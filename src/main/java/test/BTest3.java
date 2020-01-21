package test;

import java.util.Arrays;
import java.util.Scanner;

public class BTest3 {
    public static int perfectSubstring(String s, int k) {
        int result = 0;


        for (int i = 0; i < s.length(); i++)
            for (int j = i+1; j < s.length(); j++) {
                String [] sub = s.substring(i, j).split("");
                System.out.println(s.substring(i, j));



            }
        return result;
    }

    private static boolean check(String substring) {
        String [] sub = substring.split("");
        int [] arr = new int[10];
        for (int n = 0; n < 10; n++)
            arr[n] = 0;
        for (int m = 0; m < sub.length; m++)
            ++arr[Integer.parseInt(sub[m])];
        for (int o = 0; o < arr.length; o++) {
//                    System.out.print(arr[o] + " ");
            if (arr[o] != 0 || arr[o] != k) break;
            else
                ++result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = Integer.parseInt(sc.nextLine());
        System.out.println(perfectSubstring(s, k));
    }
}
