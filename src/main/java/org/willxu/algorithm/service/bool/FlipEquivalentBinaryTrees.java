package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface FlipEquivalentBinaryTrees {
    /**
     * For a binary tree T, we can define a flip operation as follows:
     * choose any node, and swap the left and right child subtrees.
     * <p>
     * A binary tree X is flip equivalent to a binary tree Y if and only
     * if we can make X equal to Y after some number of flip operations.
     * <p>
     * Given the roots of two binary trees root1 and root2, return true
     * if the two trees are flip equivalent or false otherwise.
     *
     * @param root1,root2 The number of nodes in each tree is in the
     *                    range [0, 100].
     *                    Each tree will have unique node values in the
     *                    range [0, 99].
     */
    boolean flipEquiv(TreeNode root1, TreeNode root2);
}
