package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.bool.UnivaluedBinaryTree;

public class UnivaluedBinaryTreeRecursive implements UnivaluedBinaryTree {
    /**
     * 1. Check root with left and right.
     * 2. Recursive check root.left and root.right.
     *
     * @param root 1 <= root.size <= 100
     *             0 <= Node.val < 100
     * @return root, left, and right is unival tree
     */
    @Override
    public boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        boolean leftSame = root.left == null || root.val == root.left.val;
        boolean rightSame = root.right == null || root.val == root.right.val;
        return leftSame && rightSame
                && isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
