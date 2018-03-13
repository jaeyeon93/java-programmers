package yoon;

public class ExceptionMessage2 {
    public static void md1(int n) {
        md2(n, 0); // 이 지점으로 md2로부터 예외가 넘어온다
    }

    public static void md2(int n1, int n2) {
        int r = n1 / n2; // 이 지점에서 예외가 발생한다.
    }

    public static void main(String [] args) {
        try {
            md1(3);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
