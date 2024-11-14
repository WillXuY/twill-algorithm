package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface DeleteLeavesWithGivenValue {
    /**
     * Given a binary tree root and an integer target, delete all the
     * leaf nodes with value target.
     * <p>
     * Note that once you delete a leaf node with value target, if its
     * parent node becomes a leaf node and has the value target, it
     * should also be deleted (you need to continue doing that until you
     * cannot).
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 3000].
     * @param target 1 <= Node.val, target <= 1000
     */
    TreeNode removeLeafNodes(TreeNode root, int target);
}
