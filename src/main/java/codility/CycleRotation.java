package codility;

import java.util.Arrays;
import java.util.Scanner;

//https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
public class CycleRotation {
    public static int [] move(int [] arr, int n) {
        for (int j = 0; j < n; j++) {
            int last = arr[arr.length-1];
            for (int i = arr.length-1; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = last;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {3, 8 , 9, 7 ,6};
        int count = sc.nextInt();
        System.out.println(Arrays.toString(move(arr, count)));
    }
}
