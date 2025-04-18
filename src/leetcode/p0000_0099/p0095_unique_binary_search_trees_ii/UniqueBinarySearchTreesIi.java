package leetcode.p0000_0099.p0095_unique_binary_search_trees_ii;

import common.provide.TreeNode;

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
