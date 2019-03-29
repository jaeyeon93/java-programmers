package baekjoon;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Baekjoon1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> color = new HashMap<>();
        color.put("black", 0);
        color.put("brown", 1);
        color.put("red", 2);
        color.put("orange", 3);
        color.put("yellow", 4);
        color.put("green", 5);
        color.put("blue", 6);
        color.put("violet", 7);
        color.put("grey", 8);
        color.put("white", 9);
        HashMap<Integer, Integer> value = new HashMap<>();
        value.put(0, 1);
        value.put(1, 10);
        value.put(2, 100);
        value.put(3, 1000);
        value.put(4, 10000);
        value.put(5, 100000);
        value.put(6, 1000000);
        value.put(7, 10000000);
        value.put(8, 100000000);
        value.put(9, 1000000000);
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        BigInteger result = BigInteger.valueOf(color.get(first)*10+color.get(second)).multiply(BigInteger.valueOf(value.get(color.get(third))));
        System.out.println(result);
    }
}
