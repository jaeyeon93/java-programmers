package leetcode;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb;
        int n = s.length();
        int result = 0;
        char [] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            // 초기화.
            sb = new StringBuilder();
            sb.append(arr[i]);
            int size = 1;
            for (int j = i+1; j+1 <= n; j++) {
                if (arr[i] == arr[j]) {
                    if (size > result) result = size;
                    break;
                } else if (sb.indexOf(String.valueOf(arr[j])) != -1) {
                    if (size > result) result = size;
                    break;
                } else {
                    sb.append(arr[j]);
                    ++size;
                }
                if (size > result) result = size;
            }
            if (size > result) result = size;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("au"));
    }
}
