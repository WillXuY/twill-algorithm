package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface EvenOddTree {

	/**
	 * A binary tree is named Even-Odd if it meets the following
	 * conditions:
	 * <p>
	 * - The root of the binary tree is at level index 0, its children
	 *   are at level index 1, their children are at level index 2, etc.
	 * - For every even-indexed level, all nodes at the level have odd
	 *   integer values in strictly increasing order (from left to right).
	 * - For every odd-indexed level, all nodes at the level have even
	 *   integer values in strictly decreasing order (from left to right).
	 * <p>
	 * Given the root of a binary tree, return true if the binary tree
	 * is Even-Odd, otherwise return false.
	 * 
	 * @param root The number of nodes in the tree is in the range
	 *             [1, 10^5].
	 *             1 <= Node.val <= 10^6
	 */
	boolean isEvenOddTree(TreeNode root);
}
