package topcoder;

import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/validate-binary-search-tree/submissions/
public class ValidBst {
    private static TreeNode root;

    private static class TreeNode {
        int val;
        int idx;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private static boolean helper(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        if ((min != null && root.val <= min.val) || (max != null && root.val >= max.val)) return false;
        return helper(root.left, min, root) && helper(root.right, root, max);
    }

    private static TreeNode findNodeByIndex(TreeNode root, int findIdx, int curIdx) {
        if (findIdx == curIdx)
            return root;
        return findNodeByIndex(root.left, findIdx, curIdx/2);
    }
}
