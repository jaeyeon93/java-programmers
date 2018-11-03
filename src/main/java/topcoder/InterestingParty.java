package topcoder;

import java.util.HashMap;

public class InterestingParty {
    public static int solution(String [] first, String [] second) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], 0);
            map.put(second[i], 0);
        }

        for (int i = 0; i < first.length; i++) {
            map.put(first[i], map.get(first[i])+1);
            map.put(second[i], map.get(first[i])+1);
        }

        int ans = 0;
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        System.out.println(map);
//            ans = Math.max(ans, map.get(key));
        return ans;
    }

    public static void main(String[] args) {
        String [] first = {"snakes", "diversity", "loquacity", "courtesy"};
        String [] second = {"python", "python", "anaconda", "python"};
        System.out.println(solution(first, second));
    }
}
