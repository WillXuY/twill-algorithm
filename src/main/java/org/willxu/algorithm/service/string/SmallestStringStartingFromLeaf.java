package org.willxu.algorithm.service.string;

import org.willxu.algorithm.provide.TreeNode;

public interface SmallestStringStartingFromLeaf {
    /**
     * You are given the root of a binary tree where each node has a
     * value in the range [0, 25] representing the letters 'a' to 'z'.
     * <p>
     * Return the lexicographically smallest string that starts at a
     * leaf of this tree and ends at the root.
     * <p>
     * As a reminder, any shorter prefix of a string is
     * lexicographically smaller.
     * <p>
     * - For example, "ab" is lexicographically smaller than "aba".
     * <p>
     * A leaf of a node is a node that has no children.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 8500].
     *             0 <= Node.val <= 25
     */
    String smallestFromLeaf(TreeNode root);
}
