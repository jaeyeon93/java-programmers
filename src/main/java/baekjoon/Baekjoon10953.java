package baekjoon;

import java.util.Scanner;

public class Baekjoon10953 {
    public static Integer solution(String n) {
        String [] arr = n.split(",");
        return Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++)
            System.out.println(solution(sc.next()));
    }
}
