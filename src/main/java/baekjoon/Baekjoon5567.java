package baekjoon;

import java.util.*;

public class Baekjoon5567 {
//    static class Node {
//        int from;
//        int to;
//        boolean check;
//        public Node(int from, int to) {
//            this.from = from;
//            this.to = to;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int count = 0;
//        List<Node> list = new ArrayList<>();
//        for (int i = 0; i < m; i++) {
//            int from = sc.nextInt();
//            int to = sc.nextInt();
//            list.add(new Node(from, to));
//        }
//        System.out.println(list);
//        Stack<Node> stack = new Stack<>();
//        Iterator<Node> itr = list.iterator();
//
//        // 상근이와 친구들은 다 넣었다.
//        while (itr.hasNext()) {
//            Node current = itr.next();
//
//            if (current.check != true && current.from == 1) {
//                current.check = true;
//                stack.push(current);
//                count++;
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n+1][n+1];
        boolean [] visit = new boolean[n+1];
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        int answer = 0;

        //상근이와 직접적인 친구
        for (int i = 2; i <= n; i++) {
            if (arr[1][i] == 1) {
                //상근이 직접친구
                if (!visit[i]) {
                    answer++;
                    visit[i] = true;
                }

                // 상근이 친구의 친구
                for (int j = 2; j <= n; j++) {
                    if (arr[i][j] == 1 && !visit[j]) {
                        answer++;
                        visit[j] = true;
                    }
                }
            }
        }


        System.out.println(answer);
    }
}
