//https://www.hackerrank.com/challenges/find-the-median/problem
package algorithm;

import java.util.Scanner;

public class findMedian {
    static void findMedian(int[] arr, int n) {
        for(int k=0;k<arr.length-1;k++){
            for(int i=0;i<arr.length-1;i++){
                int key = arr[k+1];
                if(i==k+1)
                    break;
                if(arr[i]>key){
                    arr[k+1]=arr[i];
                    arr[i]=key;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int result = n /2 + 1;
        System.out.print(arr[result]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        //int result = findMedian(arr);
        findMedian(arr, n);
        //System.out.println(result);
        in.close();
    }
}
