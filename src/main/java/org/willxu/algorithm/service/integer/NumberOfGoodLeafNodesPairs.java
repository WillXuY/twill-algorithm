package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface NumberOfGoodLeafNodesPairs {
	/**
	 * You are given the root of a binary tree and an integer distance.
	 * A pair of two different leaf nodes of a binary tree is said to be
	 * good if the length of the shortest path between them is less than
	 * or equal to distance.
	 * <p>
	 * Return the number of good leaf node pairs in the tree.
	 * 
	 * @param root The number of nodes in the tree is in the range [1, 2^10].
	 *             1 <= Node.val <= 100
	 * @param distance 1 <= distance <= 10
	 */
    int countPairs(TreeNode root, int distance);
}
