package org.willxu.algorithm.service.treenode;

import common.provide.TreeNode;

public interface BinaryTreePruning {
    /**
     * Given the root of a binary tree, return the same tree where every
     * subtree (of the given tree) not containing a 1 has been removed.
     * <p>
     * A subtree of a node node is node plus every node that is a
     * descendant of node.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 200].
     *             Node.val is either 0 or 1.
     */
    TreeNode pruneTree(TreeNode root);
}
