package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/1065
public class Baekjoon1065 {
    public static boolean checkNumber(int number) {
        System.out.println("전달받은 수 : " + number);
        String [] arr = String.valueOf(number).split("");
        for (int i = 0; i < arr.length-2; i++)
            if ((Integer.parseInt(arr[i+1]) - Integer.parseInt(arr[i])) == (Integer.parseInt(arr[i+2]) - Integer.parseInt(arr[i+1])))
                return true;
        return false;
    }

    public static int counting(int bound) {
        int count = 0;
        for (int i = 2; i <= bound; i++)
            if (checkNumber(i)) {
                System.out.println("count증가");
                count++;
            }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(counting(110));
    }
}
