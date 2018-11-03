package baekjoon;

public class Baekjoon1003 {
    public static Integer solution(int n) {
        int [] table = new int[100];

        if (n < 0)
            return 0;

        if (n == 0)
            return 1;

        if (n == 1)
            return 1;

        table[0] = 1;
        table[1] = 1;
        table[n] = solution(n-1) + solution(n -2);
        return table[n];
    }

    public static void main(String[] args) {
        int result = solution(50);
        System.out.println(result);
    }
}
