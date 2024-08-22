package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PathInZigzagLabelledBinaryTree {
    /**
     * In an infinite binary tree where every node has two children, the
     * nodes are labelled in row order.
     * <p>
     * In the odd numbered rows (ie., the first, third, fifth,...), the
     * labelling is left to right, while in the even numbered rows
     * (second, fourth, sixth,...), the labelling is right to left.
     * <p>
     * Given the label of a node in this tree, return the labels in the
     * path from the root of the tree to the node with that label.
     *
     * @param label 1 <= label <= 10^6
     */
    List<Integer> pathInZigZagTree(int label);
}
