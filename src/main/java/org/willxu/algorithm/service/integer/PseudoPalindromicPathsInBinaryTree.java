package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface PseudoPalindromicPathsInBinaryTree {
    /**
     * Given a binary tree where node values are digits from 1 to 9. A
     * path in the binary tree is said to be pseudo-palindromic if at
     * least one permutation of the node values in the path is a
     * palindrome.
     * <p>
     * Return the number of pseudo-palindromic paths going from the root
     * node to leaf nodes.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^5].
     *             1 <= Node.val <= 9
     */
    int pseudoPalindromicPaths (TreeNode root);
}
