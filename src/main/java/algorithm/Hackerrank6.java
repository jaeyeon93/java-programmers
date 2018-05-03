package algorithm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

//https://www.hackerrank.com/challenges/alternating-characters/problem
public class Hackerrank6 {
    static int alternatingCharacters(String s){
        int result = 0;
        List<String> arr = Arrays.asList(s.split(""));
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i).equals(arr.get(i-1)))
                result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
