package leetcode;

// https://leetcode.com/problems/valid-palindrome/submissions/
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String converted = convert(s);
        System.out.println(converted);
        if (converted.length() == 0 || converted.length() == 1) {
            return true;
        }
        char [] arr = converted.toCharArray();
        int length = arr.length;
        for (int i = 0; i <= length/2; i++) {
            if (arr[i] != arr[length-i-1])
                return false;
        }
        return true;
    }

    public static String convert(String s) {
        StringBuilder sb = new StringBuilder();
        char [] arr = s.toLowerCase().toCharArray();
        for (char c : arr) {
            if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
