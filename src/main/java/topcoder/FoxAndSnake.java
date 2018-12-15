package topcoder;

import java.util.Scanner;

public class FoxAndSnake {
    public static String width(int width) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < width; i++)
            sb.append("#");
        return sb.toString();
    }

    public static String height(int height, int size, int k) {
        StringBuilder sb = new StringBuilder();
        if (k % 4 == 2) {
            for (int i = 0; i < size-1; i++)
                sb.append(".");
            sb.append("#");
            return sb.toString();
        }
        sb.append("#");
        for (int i = 0; i < size-1; i++)
            sb.append(".");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int size = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            if (i % 2 == 1)
                System.out.println(width(size));
            if (i % 2 == 0)
                System.out.println(height(height, size, i));
        }
    }
}
