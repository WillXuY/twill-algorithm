package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface UniqueBinarySearchTreesIi {
    /**
     * Given an integer n, return all the structurally unique BST's
     * (binary search trees), which has exactly n nodes of unique values
     * from 1 to n. Return the answer in any order.
     *
     * @param n 1 <= n <= 8
     */
    List<TreeNode> generateTrees(int n);
}
