package test;

import java.util.Scanner;

public class Om1 {
    public static int solution(int instances, int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i is " + i + " value is " + arr[i]);
            if (arr[i] < 25 && instances > 1) {

                instances = (int)Math.ceil(instances / 2.0);
                i += 10;
                // reduxing
            }
            else if (arr[i] >= 25 && arr[i] < 60)
                continue;
            else if (arr[i] > 60 && instances <= (int)(Math.pow(10, 8))) {
                // increasing
                instances *= 2;
                i += 10;
            }
        }
        return instances;
    }

    public static void main(String[] args) {
//        int [] arr = {30,5,4,8,19,89};
        int [] arr = {25,23,1,2,3,4,5,6,7,8,9,10,76,80};
        int instance = 5;
        System.out.println(solution(instance, arr));
    }
}
