package inflearn;

public class Recursion1 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println(result);
    }

    public static int func(int k) {
        if (k <= 0)
            return 0;
        else {
            return k + func(k - 1);
        }
    }
}
