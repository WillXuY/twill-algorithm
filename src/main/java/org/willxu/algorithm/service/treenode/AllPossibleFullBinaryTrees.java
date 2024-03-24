package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface AllPossibleFullBinaryTrees {
    /**
     * Given an integer n, return a list of all possible full binary
     * trees with n nodes. Each node of each tree in the answer must
     * have Node.val == 0.
     * <p>
     * Each element of the answer is the root node of one possible tree.
     * You may return the final list of trees in any order.
     * <p>
     * A full binary tree is a binary tree where each node has exactly
     * 0 or 2 children.
     *
     * @param n 1 <= n <= 20
     */
    List<TreeNode> allPossibleFBT(int n);
}
