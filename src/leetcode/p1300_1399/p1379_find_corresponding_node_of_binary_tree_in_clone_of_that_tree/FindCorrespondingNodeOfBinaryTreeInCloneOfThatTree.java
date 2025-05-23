package leetcode.p1300_1399.p1379_find_corresponding_node_of_binary_tree_in_clone_of_that_tree;

import common.provide.TreeNode;

public interface FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {
    /**
     * Given two binary trees original and cloned and given a reference
     * to a node target in the original tree.
     *
     * The cloned tree is a copy of the original tree.
     *
     * Return a reference to the same node in the cloned tree.
     *
     * Note that you are not allowed to change any of the two trees or
     * the target node and the answer must be a reference to a node in
     * the cloned tree.
     *
     * Constraints:
     *
     * The number of nodes in the tree is in the range [1, 104].
     * The values of the nodes of the tree are unique.
     * target node is a node from the original tree and is not null.
     */
    TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned,
                           final TreeNode target);
}
