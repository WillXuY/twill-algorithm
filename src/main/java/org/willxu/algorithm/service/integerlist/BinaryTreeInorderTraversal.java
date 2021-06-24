package org.willxu.algorithm.service.integerlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface BinaryTreeInorderTraversal {
    /**
     * Given the root of a binary tree, return the inorder traversal of
     * its nodes' values.
     *
     * Constraints:
     * -100 <= Node.val <= 100
     *
     * Follow up:
     * Recursive solution is trivial, could you do it iteratively?
     *
     * @param root The number of nodes in the tree is in the range
     *            [0, 100].
     * @return the inorder traversal of its nodes' values.
     */
    List<Integer> inorderTraversal(TreeNode root);
}
