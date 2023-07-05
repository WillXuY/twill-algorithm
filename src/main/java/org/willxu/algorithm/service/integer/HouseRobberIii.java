package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface HouseRobberIii {
    /**
     * The thief has found himself a new place for his thievery again.
     * There is only one entrance to this area, called root.
     * <p>
     * Besides the root, each house has one and only one parent house.
     * After a tour, the smart thief realized that all houses in this
     * place form a binary tree. It will automatically contact the
     * police if two directly-linked houses were broken into on the
     * same night.
     * <p>
     * Given the root of the binary tree, return the maximum amount of
     * money the thief can rob without alerting the police.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             0 <= Node.val <= 10^4
     */
    int rob(TreeNode root);
}
