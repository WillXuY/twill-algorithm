package org.willxu.algorithm.service.bool;

public interface VerifyPreorderSerializationOfBinaryTree {
    /**
     * One way to serialize a binary tree is to use preorder traversal.
     * When we encounter a non-null node, we record the node's value. If
     * it is a null node, we record using a sentinel value such as '#'.
     * <p>
     * For example, the above binary tree can be serialized to the
     * string "9,3,4,#,#,1,#,#,2,#,6,#,#", where '#' represents a null
     * node.
     * <p>
     * Given a string of comma-separated values preorder, return true if
     * it is a correct preorder traversal serialization of a binary tree.
     * <p>
     * It is guaranteed that each comma-separated value in the string
     * must be either an integer or a character '#' representing null
     * pointer.
     * <p>
     * You may assume that the input format is always valid.
     * <p>
     * - For example, it could never contain two consecutive commas,
     *   suchA as "1,,3".
     * <p>
     * Note: You are not allowed to reconstruct the tree.
     *
     * @param preorder 1 <= preorder.length <= 10^4
     *                 preorder consist of integers in the range
     *                 [0, 100] and '#' separated by commas ','.
     */
    boolean isValidSerialization(String preorder);
}
