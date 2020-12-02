package leetcode;

// https://leetcode.com/problems/powx-n/submissions/
public class Pow {
    public static double myPow(double x, int n) {
        double result = 1.0;
        if (n == 0 || x == 1.0)
            return 1.0;
        else if (n == Integer.MAX_VALUE || n == Integer.MIN_VALUE) {
            if (x == -1) return (n % 2) == 0 ? 1.0 : -1.0;
            return 0.0;
        } else if (n > 0) {
            for (int i = 0; i < n; i++)
                result *= x;
        } else {
            for (int i = n; i < 0; i++)
                result /= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myPow(1.00000, 2147483647));
    }
}
