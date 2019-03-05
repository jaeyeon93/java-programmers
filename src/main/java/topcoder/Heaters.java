package topcoder;

import java.util.Scanner;

public class Heaters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int [] arr = new int[n];
        boolean [] arr2 = new boolean[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count++;
                int start = (i-r+1);
                int end = (i+r-1);
                if (start < 0)
                    start = 0;
                if (end > n)
                    end = n-1;
                System.out.println("start : " + start + " end : " + end);
                for (int j = start; j < end; j++) {
                    int temp = 0;
                    if (arr2[j] == false) {
                        arr2[j] = true;
                        temp++;
                        if (temp == 0)
                            count--;
                    }
                }
            }
        }


        for (int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");
        System.out.println();
        System.out.println(count);
    }
}
