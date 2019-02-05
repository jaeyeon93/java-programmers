package baekjoon;

import java.util.Scanner;

public class Baekjoon2744 {
    public static char convert(int i) {
        if (i >= 65 && i <= 90)
            return (char)(i+32);
        return (char)(i-32);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            sb.append(convert((int)str.charAt(i)));
        System.out.println(sb.toString());
    }
}
