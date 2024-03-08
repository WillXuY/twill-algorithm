package org.willxu.algorithm.service.intlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface AllNodesDistanceKinBinaryTree {
    /**
     * Given the root of a binary tree, the value of a target node
     * target, and an integer k, return an array of the values of all
     * nodes that have a distance k from the target node.
     * <p>
     * You can return the answer in any order.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 500].
     *             0 <= Node.val <= 500
     *             All the values Node.val are unique.
     * @param target is the value of one of the nodes in the tree.
     * @param k 0 <= k <= 1000
     */
    List<Integer> distanceK(TreeNode root, TreeNode target, int k);
}
