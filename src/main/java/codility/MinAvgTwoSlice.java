package codility;

import java.util.ArrayList;
import java.util.List;

public class MinAvgTwoSlice {
    public static Integer solution(int [] A) {
        int sum = 0;
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            sums.add(sum);
        }
        double avg = sums.get(0);
        for (int i = 0; i < sums.size()-1; i++)
            for (int j = i+1; j < sums.size(); j++) {
                double temp = (sums.get(j) - sums.get(i))/(j-i);
                if (temp < avg)
                    avg = temp;
            }
        return (int)avg;
    }

    public static void main(String[] args) {
        int [] arr = {4,2,2,5,1,5,8};
        System.out.println(solution(arr));
    }
}
