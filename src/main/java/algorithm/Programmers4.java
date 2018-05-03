package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/challenge_codes/118
public class Programmers4 {
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}

class ReverseInt {
    public int reverseInt(int n){
        List<String> arr = Arrays.asList(String.valueOf(n).split(""));
        List<String> arr2 = new ArrayList<>();
        for (String s : arr)
            arr2.add(s);
        Collections.sort(arr2);
        Collections.reverse(arr2);
        return Integer.parseInt(String.join("", arr2));
    }
}
