package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hackerrank7 {
    static int gemstones(String[] arr){
        int result = 0;
        List<String> myArr = Arrays.asList(arr);
        for (int i = 0; i < myArr.size(); i++) {
            List<String> countArr = Arrays.asList(myArr.get(i).split(""));
            for (int j = 1; j < countArr.size(); j++) {
                if (countArr.get(j-1).equals("a") && countArr.get(j).equals("b"))
                    result++;
            }
        }
        return result;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
