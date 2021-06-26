package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface SymmetricTree {
    /**
     * Given the root of a binary tree, check whether it is a mirror of
     * itself (i.e., symmetric around its center).
     *
     * @param root 1 <= root.size <= 1000
     *             -100 <= Node.val <= 100
     * @return symmetric or not
     */
    boolean isSymmetric(TreeNode root);
}
