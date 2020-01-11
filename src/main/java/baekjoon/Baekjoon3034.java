package baekjoon;

import java.util.Scanner;

public class Baekjoon3034 {
    private static String check(int input, int w, int h) {
        double max = Math.pow(Math.pow(w, 2) + Math.pow(h, 2), 0.5);
        if (max >= input)
            return "DA";
        return "NE";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int h = Integer.parseInt(input[2]);
        for (int i = 0; i < n; i++)
            System.out.println(check(sc.nextInt(), w, h));
    }
}
