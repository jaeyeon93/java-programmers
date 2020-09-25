package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder sb;
        int n = s.length();
        int result = 0;
        char [] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            sb = new StringBuilder();
            sb.append(arr[i]);
            int size = 1;
            for (int j = i+1; j < n; j++) {
                if (arr[i] != arr[j] && sb.indexOf(String.valueOf(arr[j])) == -1) {
                    sb.append(arr[j]);
                    size++;
                } else {
                    break;
                }
            }
            if (size > result) result = size;
        }
        return result;
    }
// Brute Force
    public static int leetCode1(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j-i);
        return ans;
    }

// slicing-window
    public static int leetCode2(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

//    slicing-window optimize
    public static int leetCode3(String s) {
        int n = s.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        for (int i = 0, j = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-1+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
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
