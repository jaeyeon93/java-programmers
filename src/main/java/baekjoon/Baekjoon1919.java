package baekjoon;

import java.io.*;

public class Baekjoon1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = solution(br.readLine(), br.readLine());
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }

    private static int solution(String str1, String str2) {
        int [] aCount = new int[26];
        int [] bCount = new int[26];
        int result = 0;
        for (int i = 0; i < str1.length(); i++)
            aCount[str1.charAt(i)-97]++;
        for (int i = 0; i < str2.length(); i++)
            bCount[str2.charAt(i)-97]++;

        for (int i = 0; i < aCount.length; i++)
            if (aCount != bCount) result += Math.abs(aCount[i]-bCount[i]);
        return result;
    }
}
