package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            boolean result = solution(st.nextToken(), st.nextToken());
            if (result)
                System.out.println("Possible");
            else
                System.out.println("Impossible");
        }
    }

    private static boolean solution(String inputStr, String checkStr) {
        int [] count1 = new int[26];
        int [] count2 = new int[26];
        for (int i = 0; i < inputStr.length(); i++)
            count1[inputStr.charAt(i)-97]++;
        for (int i = 0; i < checkStr.length(); i++)
            count2[checkStr.charAt(i)-97]++;

        for (int i = 0; i < count1.length; i++)
            if (count1[i] != count2[i]) return false;
        return true;
    }
}
