package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.tree.Node;

public interface PopulatingNextRightPointersInEachNode {
    /**
     * You are given a perfect binary tree where all leaves are on the
     * same level, and every parent has two children. The binary tree
     * has the following definition:
     * <p>
     * struct Node {
     *   int val;
     *   Node *left;
     *   Node *right;
     *   Node *next;
     * }
     * <p>
     * Populate each next pointer to point to its next right node. If
     * there is no next right node, the next pointer should be set to
     * NULL.
     * <p>
     * Initially, all next pointers are set to NULL.
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 212 - 1].
     *             -1000 <= Node.val <= 1000
     */
    Node connect(Node root);
}
