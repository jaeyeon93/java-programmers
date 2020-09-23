package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tree tree = new Tree();
        int n = Integer.parseInt(br.readLine());
        char [] data;
        for (int i = 0; i < n; i++) {
            data = br.readLine().replaceAll(" ", "").toCharArray();
            tree.add(data[0], data[1], data[2]);
        }

        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }

    static class Node {
        char data;
        Node left, right;
        public Node(char data) {
            this.data = data;
        };
    }

    static class Tree {
        Node root; // 처음에는 null

        public void add(char data, char leftData, char rightData) {
            // root 노드가 비어있는 최초상태.
            if (root == null) {
                if (data != '.') root = new Node(data);
                if (leftData != '.') root.left = new Node(leftData);
                if (rightData != '.') root.right = new Node(rightData);
            } else // root가 아니면 어디에 들어갈지 찾아야된다.
                search(root, data, leftData, rightData);
        }

        // 재귀를 사용하므로 도착한 노드가 null이면 종료 = 삽입위치를 못찾은 경우.
        private void search(Node root, char data, char leftData, char rightData) {
            if (root == null) return;
            else if (root.data == data) {
                if (leftData != '.') root.left = new Node(leftData);
                if (rightData != '.') root.right = new Node(rightData);
            } else {
                search(root.left, data, leftData, rightData); // 왼쪽 재귀 탐색.
                search(root.right, data, leftData, rightData); // 오른쪽 재귀 탐색
            }
        }

        // 전위순회. 순서 : 중앙 -> 좌 -> 우
        public void preorder(Node root) {
            System.out.print(root.data);
            if (root.left != null) preorder(root.left);
            if (root.right != null) preorder(root.right);
        }

        // 중위순회. 순서 : 좌 -> 중앙 -> 우
        public void inorder(Node root) {
            if (root.left != null) inorder(root.left); // 왼쪽 다 출력
            System.out.print(root.data); // 중앙출력
            if (root.right != null) inorder(root.right);
        }

        // 후위순회. 순서 : 좌->우->중
        public void postorder(Node root) {
            if (root.left != null) postorder(root.left);
            if (root.right != null) postorder(root.right);
            System.out.print(root.data);
        }
    }
}
