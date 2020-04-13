package baekjoon;

import java.util.Scanner;

public class Baekjoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String [] temp = input.split("");
        int [] arr = new int[26];

        // -1로 초기화
        for (int i = 0; i < arr.length; i++)
            arr[i] = -1;


        // 값 넣기
        for (int i = 0; i < temp.length; i++) {
            int num = (int)(temp[i].charAt(0))-97;
            if (arr[num] == -1)
                arr[num] = i;
        }

        // 결과 순회
        for (int i : arr)
            System.out.print(i + " ");
    }

}
