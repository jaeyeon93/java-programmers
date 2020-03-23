package hacker;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/runningtime/problem
public class RunningTimeAlgorithm {
    static int runningTime(int [] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            printArr(arr);
            int j = i;
            int value = arr[i];
            while (j >= 1 && arr[j-1] > value) {
                arr[j] = arr[j - 1];
                j--;
                count++;
            }
            arr[j] = value;
        }
        return count;
    }

    static void printArr(int [] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
