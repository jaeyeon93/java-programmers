package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Baekjoon1068 {
    private static List<Integer> [] map;
    private static boolean [] visit;
    private static int leafCount = 0;
    private static int num;
    private static int root;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new List[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++)
            map[i] = new LinkedList<>();
        String [] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(input[i]);
            if (num != -1) {
                map[num].add(i);
            } else {
                root = i;
            }
        }
        int deleteNode = Integer.parseInt(br.readLine());
        findAndDeleteNode(root, deleteNode);
        visit = new boolean[n];
        dfs(root);
        System.out.println(leafCount);
    }

    public static void findAndDeleteNode(int start, int deleteNode) {
        if (deleteNode == root) {
            map[root] = null;
            return;
        }
        if (visit[start]) return;
        visit[start] = true;
        for (int i = 0 ; i < map[start].size(); i++) {
            int edge = map[start].get(i);
            if (edge == deleteNode) {
                map[start].remove(i);
                return;
            }
            if (!visit[edge]) {
                findAndDeleteNode(edge, deleteNode);
            }
        }
    }

    public static void dfs(int start) {
        try {
            if (visit[start]) {
                return;
            }
            visit[start] = true;
            if (map[start].size() == 0) {
                leafCount++;
            }
            for (int edge : map[start]) {
                if (!visit[edge]) {
                    dfs(edge);
                }
            }
        } catch (NullPointerException e) {
            return;
        }
    }
}
