package leetcode;

public class LongestPalindromic {
    public static String longestPalindrome(String s) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        char [] arr = s.toCharArray();
        if (s.length() == 1) return s;

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (isPalindrome(sb.toString()) && (sb.length() > result.length())) {
                result = sb.toString();
            }
            for (int j = i+1; j < arr.length; j++) {
                sb.append(arr[j]);
                if (isPalindrome(sb.toString()) && (sb.length() > result.length())) {
                    result = sb.toString();
                }
            }
            sb = new StringBuilder();
        }
        return result;
    }

    private static boolean isPalindrome(String input) {
        if (input.length() == 1) return true;
        char [] arr = input.toCharArray();
        int length = arr.length;
        for (int i = 0; i <= length/2; i++) {
            if (arr[i] != arr[length-i-1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bb"));

        // time exceed
        System.out.println(longestPalindrome("ukxidnpsdfwieixhjnannbmtppviyppjgbsludrzdleeiydzawnfmiiztsjqqqnthwinsqnrhfjxtklvbozkaeetmblqbxbugxycrlzizthtuwxlmgfjokhqjyukrftvfwikxlptydybmmzdhworzlaeztwsjyqnshggxdsjrzazphugckgykzhqkdrleaueuajjdpgagwtueoyybzanrvrgevolwssvqimgzpkxehnunycmlnetfaflhusauopyizbcpntywntadciopanyjoamoyexaxulzrktneytynmheigspgyhkelxgwplizyszcwdixzgxzgxiawstbnpjezxinyowmqsysazgwxpthloegxvezsxcvorzquzdtfcvckjpewowazuaynfpxsxrihsfswrmuvluwbdazmcealapulnahgdxxycizeqelesvshkgpavihywwlhdfopmmbwegibxhluantulnccqieyrbjjqtlgkpfezpxmlwpyohdyftzgbeoioquxpnrwrgzlhtlgyfwxtqcgkzcuuwagmlvgiwrhnredtulxudrmepbunyamssrfwyvgabbcfzzjayccvvwxzbfgeglqmuogqmhkjebehtwnmxotjwjszvrvpfpafwomlyqsgnysydfdlbbltlwugtapwgfnsiqxcnmdlrxoodkhaaaiioqglgeyuxqefdxbqbgbltrxcnihfwnzevvtkkvtejtecqyhqwjnnwfrzptzhdnmvsjnnsnixovnotugpzuymkjplctzqbfkdbeinvtgdpcbvzrmxdqthgorpaimpsaenmnyuyoqjqqrtcwiejutafyqmfauufwripmpcoknzyphratopyuadgsfrsrqkfwkdlvuzyepsiolpxkbijqw"));
    }
}
