package codility;

import java.util.ArrayList;
import java.util.List;

public class MinPerimeter {
    public static Integer solution(int N) {
        int temp = 2*(1+N);
        for (int i = 1; i < N/2; i++)
            if (N % i == 0) {
                int perimeter = 2*(i + (N/i));
                if (perimeter < temp)
                    temp = perimeter;
            }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(solution(30));
    }
}
