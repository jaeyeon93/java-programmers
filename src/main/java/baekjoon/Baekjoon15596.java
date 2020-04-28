package baekjoon;

public class Baekjoon15596 {
    public static long sum(int [] a) {
        long sum = 0;
        for (int i : a)
            sum += i;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(new int [] {1,2,3,4,5,6}));
    }
}
