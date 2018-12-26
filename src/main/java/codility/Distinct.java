package codility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Distinct {
    public static Integer solution(int [] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++)
            map.put(A[i], 0);

        for (int i = 0; i < A.length; i++) {
            int count = map.get(A[i]);
            map.put(A[i], ++count);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        System.out.println(keySet);

        for (Integer i : keySet)
            if (map.get(i) == 1)
                return i;
        return 0;
    }

    public static void main(String[] args) {
        int [] arr = {2,1,1,2,3,1};
        int result = solution(arr);
        System.out.println(result);
    }
}
