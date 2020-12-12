package leetcode;

import java.util.TreeMap;

public class MaximumDepthOfBinaryTree {
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
    }

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode current;
        if (val <= root.val) {
            current = insert(root.left, val);
            root = root.left;
        } else {
            current = insert(root.right, val);
            root = root.right;
        }
        return root;
    }
}
