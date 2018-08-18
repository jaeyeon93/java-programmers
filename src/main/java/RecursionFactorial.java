public class RecursionFactorial {
    static int result = 1;

    public static void main(String[] args) {
        System.out.println(facotorial(5));
    }

    public static Integer facotorial(int n) {
        if (n == 1) {
            result *= n;
            return result;
        }
        result *= n;
        return facotorial(n - 1);
    }
}
