package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Baekjoon2935 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.nextLine());
        String mod = sc.nextLine();
        BigInteger b = new BigInteger(sc.nextLine());
        if (mod.equals("+")) {
            System.out.println(a.add(b));
        } else
            System.out.println(a.multiply(b));

    }
}
