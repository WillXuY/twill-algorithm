package org.willxu.algorithm.domain.bool;

import org.willxu.algorithm.provide.TreeNode;

/**
 * Given a binary tree with the following rules:
 * <p>
 * 1. root.val == 0
 * 2. If treeNode.val == x and treeNode.left != null, then
 *    treeNode.left.val == 2 * x + 1
 * 3. If treeNode.val == x and treeNode.right != null, then
 *    treeNode.right.val == 2 * x + 2
 * <p>
 * Now the binary tree is contaminated, which means all treeNode.val
 * have been changed to -1.
 * <p>
 * Implement the FindElements class:
 * <p>
 * Total calls of find() is between [1, 10^4]
 */
public abstract class FindElementsInContaminatedBinaryTree {
    /**
     * Initializes the object with a contaminated binary tree and
     * recovers it.
     *
     * @param root TreeNode.val == -1
     *             The height of the binary tree is less than or equal to 20
     *             The total number of nodes is between [1, 10^4]
     */
    public FindElementsInContaminatedBinaryTree(TreeNode root) {}

    /**
     * @param target 0 <= target <= 10^6
     * @return true if the target value exists in the recovered binary tree.
     */
    public abstract boolean find(int target);
}
