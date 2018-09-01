package algorithm;

public class HackerRank11 {
    public Integer result(int n) {
        if (n < 38)
            return n;
        else if (findMultiple(n) - n < 3)
            return findMultiple(n);
        return n;
    }

    public Integer findMultiple(int n) {
        int div = n / 5;
        return (div*5 + 5);
    }

    public static void main(String[] args) {

    }
}
