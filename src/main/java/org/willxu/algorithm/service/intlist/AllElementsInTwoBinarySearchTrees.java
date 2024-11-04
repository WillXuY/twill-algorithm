package org.willxu.algorithm.service.intlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface AllElementsInTwoBinarySearchTrees {
    /**
     * Given two binary search trees root1 and root2, return a list
     * containing all the integers from both trees sorted in ascending
     * order.
     *
     * @param root1,root2 The number of nodes in each tree is in the
     *                    range [0, 5000].
     *                    -10^5 <= Node.val <= 10^5
     */
    List<Integer> getAllElements(TreeNode root1, TreeNode root2);
}
