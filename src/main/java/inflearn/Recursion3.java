package inflearn;

// Fibonacci
public class Recursion3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
