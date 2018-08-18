public class RecursionPibonacci {
    public static void main(String[] args) {
        int result = pibonacci(48);
        System.out.println(result);
    }

    public static Integer pibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return pibonacci(n - 1) + pibonacci(n - 2);
    }
}
