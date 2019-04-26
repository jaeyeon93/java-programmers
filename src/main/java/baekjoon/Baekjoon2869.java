package baekjoon;

import java.io.*;

public class Baekjoon2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int h = Integer.parseInt(arr[2]);
        int current = 0;
        int day = 0;
        while (current <= h) {
            current += a;
            if (current >= h) {
                day++;
                break;
            }
            current -= b;
            day++;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(day));
        bw.flush();
        bw.close();
    }
}
