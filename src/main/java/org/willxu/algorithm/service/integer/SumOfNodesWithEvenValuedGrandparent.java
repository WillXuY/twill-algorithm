package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface SumOfNodesWithEvenValuedGrandparent {
    /**
     * Given the root of a binary tree, return the sum of values of
     * nodes with an even-valued grandparent. If there are no nodes with
     * an even-valued grandparent, return 0.
     * <p>
     * A grandparent of a node is the parent of its parent if it exists.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             1 <= Node.val <= 100
     */
    int sumEvenGrandparent(TreeNode root);
}
