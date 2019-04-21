package baekjoon;

import java.util.Scanner;

public class Baekjoon10988 {
    public static Integer check(String str) {
        for (int i = 0; i < str.length()/2; i++)
            if ((int)str.charAt(i) != (int)str.charAt(str.length()-1-i))
                return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(check(sc.next()));
    }
}
