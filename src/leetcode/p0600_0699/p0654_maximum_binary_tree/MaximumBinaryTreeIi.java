package leetcode.p0600_0699.p0654_maximum_binary_tree;

import common.provide.TreeNode;

public interface MaximumBinaryTreeIi {
    /**
     * A maximum tree is a tree where every node has a value greater
     * than any other value in its subtree.
     * <p>
     * You are given the root of a maximum binary tree and an integer
     * val.
     * <p>
     * Just as in the previous problem, the given tree was constructed
     * from a list a (root = Construct(a)) recursively with the
     * following Construct(a) routine:
     * <p>
     * - If a is empty, return null.
     * - Otherwise, let a[i] be the largest element of a. Create a root
     *   node with the value a[i].
     * - The left child of root will be
     *   Construct([a[0], a[1], ..., a[i - 1]]).
     * - The right child of root will be
     *   Construct([a[i + 1], a[i + 2], ..., a[a.length - 1]]).
     * - Return root.
     * <p>
     * Note that we were not given a directly, only a root node
     * root = Construct(a).
     * <p>
     * Suppose b is a copy of a with the value val appended to it. It is
     * guaranteed that b has unique values.
     * <p>
     * Return Construct(b).
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 100].
     *             1 <= Node.val <= 100
     *             All the values of the tree are unique.
     * @param val 1 <= val <= 100
     */
    TreeNode insertIntoMaxTree(TreeNode root, int val);
}
