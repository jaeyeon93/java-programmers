package algorithm;

import java.util.Scanner;

public class quickSort {
    static void quicksorting(int [] arr, int l, int r){
        int left = l;
        int right = r;
        int pivot = arr[(l+r)/2];


    }

    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        in.close();
    }
}
