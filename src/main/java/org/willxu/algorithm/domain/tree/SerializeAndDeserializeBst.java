package org.willxu.algorithm.domain.tree;

import org.willxu.algorithm.provide.TreeNode;

/**
 * Serialization is converting a data structure or object into a
 * sequence of bits so that it can be stored in a file or memory
 * buffer, or transmitted across a network connection link to be
 * reconstructed later in the same or another computer environment.
 * <p>
 * Design an algorithm to serialize and deserialize a binary search
 * tree. There is no restriction on how your
 * serialization/deserialization algorithm should work. You need to
 * ensure that a binary search tree can be serialized to a string,
 * and this string can be deserialized to the original tree structure.
 * <p>
 * The encoded string should be as compact as possible.
 */
public interface SerializeAndDeserializeBst {

    /**
     * Encodes a tree to a single string.
     *
     * @param root The number of nodes in the tree is in the range [0, 10^4].
     *             0 <= Node.val <= 10^4
     *             The input tree is guaranteed to be a binary search tree.
     */
    String serialize(TreeNode root);

    /**
     * Decodes your encoded data to tree.
     *
     * @return The number of nodes in the tree is in the range [0, 10^4].
     *         0 <= Node.val <= 10^4
     *         The input tree is guaranteed to be a binary search tree.
     */
    TreeNode deserialize(String data);
}
