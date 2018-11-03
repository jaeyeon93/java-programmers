package baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        List<String> list = Arrays.asList(String.valueOf(n2).split(""));
        int first = n1 * Integer.parseInt(list.get(2));
        int second = n1 * Integer.parseInt(list.get(1));
        int third = n1 * Integer.parseInt(list.get(0));
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        int reuslt = first + 10*second + 100*third;
        System.out.println(reuslt);
    }
}
