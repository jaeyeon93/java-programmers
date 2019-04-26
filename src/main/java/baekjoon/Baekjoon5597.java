package baekjoon;

import java.util.Scanner;

public class Baekjoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] result = new boolean[31];
        result[0] = true;
        for (int i = 1; i < 31; i++)
            result[i] = false;

        for (int i = 0; i < 28; i++)
            result[sc.nextInt()] = true;

        for (int i = 0; i < 30; i++)
            if (result[i] == false)
                System.out.println(i);
    }
}
