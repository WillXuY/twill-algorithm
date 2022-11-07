package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface EvaluateBooleanBinaryTree {
    /**
     * You are given the root of a full binary tree with the following
     * properties:
     * <p>
     * - Leaf nodes have either the value 0 or 1, where 0 represents
     *   False and 1 represents True.
     * - Non-leaf nodes have either the value 2 or 3, where 2 represents
     *   the boolean OR and 3 represents the boolean AND.
     * <p>
     *  The evaluation of a node is as follows:
     * <p>
     * - If the node is a leaf node, the evaluation is the value of the
     *   node, i.e. True or False.
     * - Otherwise, evaluate the node's two children and apply the
     *   boolean operation of its value with the children's evaluations.
     * <p>
     * Return the boolean result of evaluating the root node.
     * <p>
     * A full binary tree is a binary tree where each node has either 0
     * or 2 children.
     * <p>
     * A leaf node is a node that has zero children.
     *
     * @param root The number of nodes in the tree is in the range
     *            [1, 1000].
     *             0 <= Node.val <= 3
     *             Every node has either 0 or 2 children.
     *             Leaf nodes have a value of 0 or 1.
     *             Non-leaf nodes have a value of 2 or 3.
     */
    boolean evaluateTree(TreeNode root);
}
