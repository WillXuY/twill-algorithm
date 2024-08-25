package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface DeleteNodesAndReturnForest {
    /**
     * Given the root of a binary tree, each node in the tree has a
     * distinct value.
     * <p>
     * After deleting all nodes with a value in to_delete, we are left
     * with a forest (a disjoint union of trees).
     * <p>
     * Return the roots of the trees in the remaining forest. You may
     * return the result in any order.
     *
     * @param root The number of nodes in the given tree is at most 1000.
     *             Each node has a distinct value between 1 and 1000.
     * @param to_delete to_delete.length <= 1000
     *                  to_delete contains distinct values between 1 and
     *                  1000.
     */
    List<TreeNode> delNodes(TreeNode root, int[] to_delete);
}
