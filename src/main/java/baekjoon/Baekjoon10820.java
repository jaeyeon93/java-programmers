package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/10820
public class Baekjoon10820 {
    public static void counting(String str) {
        String [] arr = str.split("");
        int lower = 0;
        int upper = 0;
        int number = 0;
        int space = 0;
        for (int i  = 0; i < arr.length; i++) {
            int converting = (int)(arr[i].charAt(0));
            if (converting >= 48 && converting <= 57)
                number++;
            if (converting >= 65 && converting <= 90)
                upper++;
            if (converting >= 97 && converting <= 122)
                lower++;
            if (converting == 32)
                space++;
        }
        System.out.println(lower + " " + upper + " " + number + " " + space);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
            counting(sc.nextLine());
    }
}
