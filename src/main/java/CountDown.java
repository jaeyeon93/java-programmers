public class CountDown {
    public static void main(String[] args) {
        countDown(10);
    }

    public static Integer countDown(int n) {
        if (n == 0) {
            System.out.println(n + "땡!");
            return n;
        }
        System.out.println(n);
        return countDown(n - 1);
    }
}
