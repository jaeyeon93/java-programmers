package inflearn;

// 문자열 프린트
public class Recursion6 {
    public static void main(String[] args) {
        String str = "hello world";
        printChars(str);
    }

    public static void printChars(String str) {
        if (str.length() == 0)
            return;
        System.out.print(str.charAt(0));
        printChars(str.substring(1));
        // 문자열에서 첫글자를 제거를 한다.
    }
}
