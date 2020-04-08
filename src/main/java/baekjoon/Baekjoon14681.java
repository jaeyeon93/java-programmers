package baekjoon;

import java.util.Scanner;

public class Baekjoon14681 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[2];

        for (int i = 0; i < 2; i++)
            arr[i] = Integer.parseInt(sc.nextLine());
        int x = arr[0];
        int y = arr[1];

        if (x > 0 && y > 0)
            System.out.println(1);
        else if (x < 0 && y > 0)
            System.out.println(2);
        else if (x < 0 && y < 0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
