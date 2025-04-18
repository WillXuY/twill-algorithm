package leetcode.p0500_0599.p0515_find_largest_value_in_each_tree_row;

import common.provide.TreeNode;

import java.util.List;

public interface FindLargestValueInEachTreeRow {
    /**
     * Given the root of a binary tree, return an array of the largest
     * value in each row of the tree (0-indexed).
     *
     * @param root The number of nodes in the tree will be in the range
     *             [0, 10^4].
     *             -2^31 <= Node.val <= 2^31 - 1
     */
    List<Integer> largestValues(TreeNode root);
}
