package topcoder;

import java.util.*;

public class PrettyNumber {
    public static Integer solution(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>();
        for (Integer f : first)
            for (Integer s : second)
                result.add(f*10+s);
        Collections.sort(result);
        for (Integer i : result) {
            String [] arr = String.valueOf(i).split("");
            if (arr[0].equals(arr[1]))
                return Integer.parseInt(arr[0]);
        }
        return result.get(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSize = sc.nextInt();
        int secondSize = sc.nextInt();
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int i = 0; i < firstSize; i++)
            first.add(sc.nextInt());

        for (int i = 0; i < secondSize; i++)
            second.add(sc.nextInt());

        System.out.println(solution(first, second));
    }
}
