package baekjoon;

import java.util.Scanner;

public class Baekjoon2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int m = Integer.parseInt(line[1]);
        String [] numbers = sc.nextLine().split(" ");
        int [] input = new int[n];
        for (int i = 0; i < n; i++)
            input[i] = Integer.parseInt(numbers[i]);

        int result = 0;
        for (int i = 0; i < n-2; i++)
            for (int j = i+1; j < n-1; j++)
                for (int k = j+1; k < n; k++) {
                    if (input[i] + input[j] + input[k] <= m && (input[i] + input[j] + input[k]) >= result)
                        result = input[i] + input[j] + input[k];
                }

        System.out.println(result);
    }
}
