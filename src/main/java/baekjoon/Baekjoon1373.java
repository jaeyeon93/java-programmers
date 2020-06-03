package baekjoon;

import java.io.*;

public class Baekjoon1373 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        long decimal = Integer.parseInt(str, 2);
        String result = Long.toOctalString(decimal);
        bw.write(result);
        bw.flush();
    }
}
