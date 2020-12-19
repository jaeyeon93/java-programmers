package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1991_2 {
    private static TreeNode root;
    private static class TreeNode {
        String data;
        TreeNode left;
        TreeNode right;

        public TreeNode(String data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data='" + data + '\'' +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    private static void insert(String data, String left, String right) {
        if (root == null) {
            if (!data.equals(".")) root = new TreeNode(data);
            if (!left.equals(".")) root.left = new TreeNode(left);
            if (!right.equals(".")) root.right = new TreeNode(right);
        } else {
            findNode(root, data, left, right);
        }
    }

    private static void findNode(TreeNode root, String data, String left, String right) {
        if (root == null) return;
        else if (root.data.equals(data)) {
            if (!left.equals(".")) root.left = new TreeNode(left);
            if (!right.equals(".")) root.right = new TreeNode(right);
        } else {
            findNode(root.left, data, left, right);
            findNode(root.right, data, left, right);
        }
    }

    private static void preOrder(TreeNode root) {
        System.out.print(root.data);
        if (root.left != null) preOrder(root.left);
        if (root.right != null) preOrder(root.right);
    }

    private static void inOrder(TreeNode root) {
        if (root.left != null) inOrder(root.left);
        System.out.print(root.data);
        if (root.right != null) inOrder(root.right);
    }

    private static void postOrder(TreeNode root) {
        if (root.left != null) postOrder(root.left);
        if (root.right != null) postOrder(root.right);
        System.out.print(root.data);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String data = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();
            insert(data, left, right);
        }
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
