package baekjoon;

import java.util.Scanner;

public class Baekjoon1212 {
    public static Long octaToDecimal(String str) {
        long result = 0;
        String [] arr = str.split("");
        for (int i = 0; i < arr.length; i++)
            result += Integer.parseInt(arr[i])*Math.pow(8, arr.length-i-1);
        return result;
    }

    public static String convertBinary(Long num) {
        StringBuilder sb = new StringBuilder();

        if (num == 0)
            return "0";

        while (num != 1) {
            long mod = num % 2;
            sb.append(mod);
            num /= 2;
        }
        sb.append(num);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(convertBinary(octaToDecimal(input)));
    }
}
