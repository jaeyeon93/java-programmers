public class RecursionSum {
    static int sum = 0;

    public static void main(String[] args) {
        sum(1, 10);
    }

    public static Integer sum(int a, int b) {
        if (a == b) {
            sum += a;
            System.out.println("finish sum : " + sum);
            return sum;
        }
        sum += a;
        System.out.println("sum : " + sum);
        return sum(a + 1, b);
    }
}
