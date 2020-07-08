package baekjoon;

import java.util.Scanner;

public class Baekjoon1475 {
    private static int [] arr = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    public static int solution(int num) {
        int result = 0;
        if (num == 0) return 1;
        while (num > 0) {
            int temp = num % 10;
            if (arr[temp] == 0) {
                if (temp == 6 && arr[9] != 0) arr[9]--;
                else if (temp == 9 && arr[6] != 0) arr[6]--;
                else {
                    for (int j = 0; j < 10; j++)
                        arr[j]++;
                    result++;
                    arr[temp]--;
                }
            } else {
                arr[temp]--;
            }
            num /= 10;
        }
        return result;
    }
}
