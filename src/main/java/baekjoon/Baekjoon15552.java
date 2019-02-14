package baekjoon;

import java.io.*;

public class Baekjoon15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()); // count
        for (int i = 0; i < n; i++) {
            String [] temp = bf.readLine().split(" ");
            bw.write(Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]) + "\n");
        }
        bw.flush();
    }
}
