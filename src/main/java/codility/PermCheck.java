package codility;

import java.util.*;
import java.util.stream.Collectors;

public class PermCheck {
//    public static Integer permCheck(int [] arr) {
//        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        Collections.sort(list);
//        System.out.println(list);
//        int sub = list.get(list.size()-1) - list.get(0);
//        if (sub == list.size())
//            return 1;
//        return 0;
//    }

    public static Integer permCheck(int [] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i]))
                return 0;

            if (A[i] > A.length)
                return 0;
            set.add(A[i]);
        }
        return 1;
    }


    public static void main(String[] args) {
        int [] arr1 = {4, 1, 3, 2};
        int [] arr2 = {4,1,3};
        System.out.println("firstCase : " + permCheck(arr1));
        System.out.println("secondCase : " + permCheck(arr2));
    }
}
