package leetcode.p0100_0199.p0117_population_next_right_pointers_in_each_node_ii;

import common.provide.tree.Node;

public interface PopulatingNextRightPointersInEachNodeIi {
    /**
     * Given a binary tree
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
     *             [0, 6000].
     *             -100 <= Node.val <= 100
     */
    Node connect(Node root);
}
