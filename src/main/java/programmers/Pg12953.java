package programmers;

public class Pg12953 {
    public static long[] solution(int x, int y) {
        long[] arr = new long[y];
        arr[0] = x;
        for (int i = 1; i < y; i++)
            arr[i] = arr[i-1] + x;
        return arr;
    }

    public static void main(String[] args) {
        long[] arr = solution(2,5);
        for (long l : arr)
            System.out.print(l + " ");
        System.out.println();
        long[] arr2 = solution(-4, 2);
        for (long l : arr2)
            System.out.print(l + " ");
        System.out.println();
    }
}
