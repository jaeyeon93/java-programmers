package baekjoon;

import java.util.Scanner;

public class Baejoon5598 {
//    public static Character convert(String str) {
//        // A: 65 Z : 90
//        if (str.charAt(0)+3 <= 90)
//            return (char)(str.charAt(0)+3);
//        //X : 88 => A : 65, Y : 89 => B: 66, Z : 90 => C : 67
//        return (char)(str.charAt(0)-23);
//    }

    public static Character convert(String str) {
        // A: 65 Z : 90
        if (str.charAt(0)-3 >= 65)
            return (char)(str.charAt(0)-3);
        //X : 88 => A : 65, Y : 89 => B: 66, Z : 90 => C : 67
        return (char)(str.charAt(0)+23);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        String [] arr = str.split("");
        for (int i = 0; i < arr.length; i++)
            sb.append(convert(arr[i]));
        System.out.println(sb.toString());
    }
}
