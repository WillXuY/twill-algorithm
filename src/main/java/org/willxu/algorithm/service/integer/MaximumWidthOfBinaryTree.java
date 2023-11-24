package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MaximumWidthOfBinaryTree {
    /**
     * Given the root of a binary tree, return the maximum width of the
     * given tree.
     * <p>
     * The maximum width of a tree is the maximum width among all levels.
     * <p>
     * The width of one level is defined as the length between the
     * end-nodes (the leftmost and rightmost non-null nodes), where the
     * null nodes between the end-nodes that would be present in a
     * complete binary tree extending down to that level are also
     * counted into the length calculation.
     * <p>
     * It is guaranteed that the answer will in the range of a 32-bit
     * signed integer.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 3000].
     *             -100 <= Node.val <= 100
     */
    int widthOfBinaryTree(TreeNode root);
}
