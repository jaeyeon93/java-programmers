package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Baekjoon5639 {
    private static StringBuilder sb = new StringBuilder();
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private static TreeNode insert(TreeNode root, int val) {
        TreeNode cur;
       if (root == null) return new TreeNode(val);
       if (root.val > val) {
           cur = insert(root.left, val);
           root.left = cur;
       } else {
           cur = insert(root.right, val);
           root.right = cur;
       }
       return root;
    }
    private static void postOrder(TreeNode treeNode) {
        if (treeNode.left != null) postOrder(treeNode.left);
        if (treeNode.right != null) postOrder(treeNode.right);
        sb.append(treeNode.val + "\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeNode tree = new TreeNode(Integer.parseInt(br.readLine()));
        while (true) {
            String input = br.readLine();
            if (input == null || input.length() == 0) break;
            System.out.println("input : " + input);
            insert(tree, Integer.parseInt(input));
        }
        postOrder(tree);
        System.out.println(sb.toString());
    }
}
