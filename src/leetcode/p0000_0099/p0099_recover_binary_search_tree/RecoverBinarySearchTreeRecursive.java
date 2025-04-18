package leetcode.p0000_0099.p0099_recover_binary_search_tree;

import common.provide.TreeNode;

public class RecoverBinarySearchTreeRecursive
        implements RecoverBinarySearchTree {
    @Override
    public void recoverTree(TreeNode root) {
        int[] output = recoverTreeRecursive(
                root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        while (output[0] != output[1]) {
            output = recoverTreeRecursive(
                    root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    /**
     * @return int[0] is target value, int[1] is exchange value.
     */
    private int[] recoverTreeRecursive(TreeNode root, int min, int max) {
        if (root.val < min) {
            int[] result = new int[] {min, root.val};
            root.val = min;
            return result;
        } else if (root.val > max) {
            int[] result = new int[] {max, root.val};
            root.val = max;
            return result;
        }
        int[] result = new int[2];
        if (root.left != null) {
            int[] sub = recoverTreeRecursive(root.left, min, root.val);
            if (sub[0] != sub[1]) {
                if (sub[0] == root.val) {
                    root.val = sub[1];
                }
                return sub;
            }
        }
        if (root.right != null) {
            int[] sub = recoverTreeRecursive(root.right, root.val, max);
            if (sub[0] != sub[1]) {
                if (sub[0] == root.val) {
                    root.val = sub[1];
                }
                return sub;
            }
        }
        return result;
    }
}
