package codility;

public class CountFactors {
    public static Integer solution(int N) {
        if (N == 1)
            return 1;

        int count = 2;
        for (int i = 2; i <= N/2; i++)
            if (N % i == 0)
                count++;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(24));
        System.out.println(solution(8));
        System.out.println(solution(4));
    }
}
