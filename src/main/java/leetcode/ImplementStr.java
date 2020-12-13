package leetcode;

// https://leetcode.com/problems/implement-strstr/submissions/
public class ImplementStr {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (haystack.equals("")) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) break;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) break;
                if (j == needle.length()-1)
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        System.out.println(strStr("hello", "ll"));
//        System.out.println(strStr("aaaaa", "bba"));
//        System.out.println(strStr("", ""));

//        System.out.println(strStr("", "a")); // expected -1;
//        System.out.println(strStr("aaa", "a")); // expected 0;

        System.out.println(strStr("aaa", "aaaa")); // expected -1
        System.out.println(strStr("a", "a")); // expected 0
    }
}
