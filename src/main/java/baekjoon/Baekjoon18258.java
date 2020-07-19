package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baekjoon18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push"))
                q.offer(Integer.parseInt(st.nextToken()));

            if (command.equals("pop"))
                if (q.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(q.poll() + "\n");

            if (command.equals("size"))
                bw.write(q.size() + "\n");

            if (command.equals("empty"))
                if (q.isEmpty())
                    bw.write(1 + "\n");
                else
                    bw.write(0 + "\n");
            if (command.equals("front"))
                if (q.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(q.peek() + "\n");

            if (command.equals("back"))
                if (q.isEmpty())
                    bw.write(-1 + "\n");
                else
                    bw.write(q.getLast() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
