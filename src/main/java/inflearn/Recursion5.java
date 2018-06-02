package inflearn;

// 문자열의 길이구하기
public class Recursion5 {
    public static void main(String[] args) {
        int result = length("hello world");
        System.out.println("result : " + result);
    }

    public static int length(String str) {
        if (str.equals(""))
            return 0;
        return 1 + length(str.substring(1));
    }
}
