package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Max Min problem
// https://programmers.co.kr/learn/challenge_codes/125
public class Programmers1 {
    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}

class GetMinMaxString {
    public String getMinMaxString(String str) {
        List<String> strList = Arrays.asList(str.split(" "));
        List<Integer> result = new ArrayList<>();
        for (String s : strList)
            result.add(Integer.parseInt(s));
        String strResult = "";
        String min = String.valueOf(Collections.min(result));
        String max = String.valueOf(Collections.max(result));
        return strResult + min + " " + max;
    }
}
