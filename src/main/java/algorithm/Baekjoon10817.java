package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        List<Integer> list = Arrays.asList(num1, num2, num3);
        Collections.sort(list);
        System.out.println(list.get(1));
    }
}
