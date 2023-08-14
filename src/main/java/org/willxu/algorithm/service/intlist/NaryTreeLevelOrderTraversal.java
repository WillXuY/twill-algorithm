package org.willxu.algorithm.service.intlist;

import org.willxu.algorithm.provide.Node;

import java.util.List;

public interface NaryTreeLevelOrderTraversal {
    /**
     * Given an n-ary tree, return the level order traversal of its
     * nodes' values.
     * <p>
     * Nary-Tree input serialization is represented in their level order
     * traversal, each group of children is separated by the null value
     * (See examples).
     *
     * @param root The height of the n-ary tree is less than or equal to
     *             1000
     *             The total number of nodes is between [0, 10^4]
     */
    List<List<Integer>> levelOrder(Node root);
}
