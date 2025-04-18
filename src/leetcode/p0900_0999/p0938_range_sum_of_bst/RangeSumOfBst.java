package leetcode.p0900_0999.p0938_range_sum_of_bst;

import common.provide.TreeNode;

public interface RangeSumOfBst {
    /**
     * Given the root node of a binary search tree and two integers low
     * and high, return the sum of values of all nodes with a value in
     * the inclusive range [low, high].
     *
     * @param root 1 <= root.size <= 2 * 10^4
     *             1 <= Node.val <= 10^5
     *             All Node.val are unique.
     * @param low 1 <= low <= high <= 10^5
     * @param high 1 <= low <= high <= 10^5
     * @return sum of node.val between low and high.
     */
    int rangeSumBST(TreeNode root, int low, int high);
}
