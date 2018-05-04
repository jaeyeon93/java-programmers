package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://programmers.co.kr/learn/challenge_codes/98
public class Programmers5 {
    public static void main(String[] args) {
        ReverseStr rs = new ReverseStr();
        System.out.println( rs.reverseStr("Zbcdefg") );
    }
}

class ReverseStr {
    public String reverseStr(String str){
        List<String> arr = Arrays.asList(str.split(""));
        Collections.sort(arr);
        Collections.reverse(arr);
        String result = String.join("", arr);
        return result;
    }
}