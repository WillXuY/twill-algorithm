package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface LowestCommonAncestorOfDeepestLeaves {
    /**
     * Given the root of a binary tree, return the lowest common
     * ancestor of its deepest leaves.
     * <p>
     * Recall that:
     * <p>
     * - The node of a binary tree is a leaf if and only if it has no
     *   children
     * - The depth of the root of the tree is 0. if the depth of a node
     *   is d, the depth of each of its children is d + 1.
     * - The lowest common ancestor of a set S of nodes, is the node A
     *   with the largest depth such that every node in S is in the
     *   subtree with root A.
     *
     * @param root The number of nodes in the tree will be in the range
     *             [1, 1000].
     *             0 <= Node.val <= 1000
     *             The values of the nodes in the tree are unique.
     */
    TreeNode lcaDeepestLeaves(TreeNode root);
}
