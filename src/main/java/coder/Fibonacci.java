package coder;

public class Fibonacci {
    public static Integer solution(int a) {
        int [] arr = new int[81];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= a; i++)
            arr[i] = arr[i] + arr[i-1];
        return arr[a];
    }

    public static void main(String[] args) {
        System.out.println(solution(0));
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}
