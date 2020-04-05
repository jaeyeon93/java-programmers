package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon4153 {
    private static String check(String [] input) {
        int [] arr = new int[input.length];
        for (int i = 0; i < input.length; i++)
            arr[i] = Integer.parseInt(input[i]);
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2)))
            return "right";
        return "wrong";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String [] input = sc.nextLine().split(" ");
            if (input[0].equals("0") && input[1].equals("0") && input[2].equals("0"))
                break;
            System.out.println(check(input));
        }
    }
}
