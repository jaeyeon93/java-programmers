package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = Arrays.asList("a","e","i","o","u");
        int num = 0;
        String [] arr = sc.next().split("");
        for (String s : arr)
            if (list.contains(s))
                num++;
        System.out.println(num);
    }
}
