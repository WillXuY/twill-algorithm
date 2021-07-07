package org.willxu.algorithm.service.integerlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface BinaryTreePostOrderTraversal {
    /**
     * Given the root of a binary tree, return the post order traversal
     * of its nodes' values.
     *
     * Follow up: Recursive solution ts trivial, could you do it
     * iteratively?
     *
     * @param root 0 <= root.size <= 100
     *             -100 <= Node.val <= 100
     * @return preorder travel sal
     */
    List<Integer> postorderTraversal(TreeNode root);
}
