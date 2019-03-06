package baekjoon;

import java.util.Scanner;

public class Baekjoon2941 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] croatia = {"c=", "c-", "dz=", "z=", "d-", "lj", "nj", "s="};
        String input = sc.next();

        for (int i = 0; i < 8; i++)
            input = input.replace(croatia[i], "a");
        System.out.println(input.length());
    }
}
