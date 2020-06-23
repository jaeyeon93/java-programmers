package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon10822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.next().split(",");
        int result = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
