package org.willxu.algorithm.service.treenode;

import common.provide.TreeNode;

import java.util.List;

public interface FindDuplicateSubtrees {
    /**
     * Given the root of a binary tree, return all duplicate subtrees.
     * <p>
     * For each kind of duplicate subtrees, you only need to return the
     * root node of any one of them.
     * <p>
     * Two trees are duplicate if they have the same structure with the
     * same node values.
     *
     * @param root The number of the nodes in the tree will be in the
     *             range [1, 5000]
     *             -200 <= Node.val <= 200
     */
    List<TreeNode> findDuplicateSubtrees(TreeNode root);
}
