package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Baekjoon18258 {
    private static List<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            solution(st, bw);
        }
        bw.flush();
        bw.close();
    }

    private static void solution(StringTokenizer st, BufferedWriter bw) throws IOException {
        String command = st.nextToken();
        if (command.equals("push"))
            q.add(Integer.parseInt(st.nextToken()));

        if (command.equals("pop"))
            if (q.isEmpty())
                bw.write(-1 + "\n");
            else {
                bw.write(q.remove(0) + "\n");
            }

        if (command.equals("size"))
            bw.write(q.size() + "\n");

        if (command.equals("empty"))
            if (q.isEmpty())
                bw.write(1 + "\n");
            else
                bw.write(0 + "\n");

        if (command.equals("front")) {
            if (q.isEmpty())
                bw.write(-1 + "\n");
            else
                bw.write(q.get(0) + "\n");
        }


        if (command.equals("back"))
            if (q.isEmpty())
                bw.write(-1 + "\n");
            else
                bw.write(q.get(q.size()-1) + "\n");
    }
}
