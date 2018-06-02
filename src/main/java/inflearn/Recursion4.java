package inflearn;

// 최대공약수 Euclid Method
public class Recursion4 {
    public static void main(String[] args) {

    }

    public static int gcd(int p, int q) {
        if (q == 0)
            return p;
        return gcd(q, p%q);
    }
}
