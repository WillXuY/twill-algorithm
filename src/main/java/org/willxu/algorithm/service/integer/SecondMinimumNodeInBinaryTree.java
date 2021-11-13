/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface SecondMinimumNodeInBinaryTree {
    /**
     * Given a non-empty special binary tree consisting of nodes with
     * the non-negative value, where each node in this tree has exactly
     * two or zero sub-node. If the node has two sub-nodes, then his
     * node's value is the smaller value among its two sub-nodes. More
     * formally, the property root.val = min(root.left.val,
     * root.right.val) always holds.
     * Given such a binary tree, you need to output the second minimum
     * value in the set made of all the nodes' value in the whole tree.
     * If no such second minimum value exists, output -1 instead.
     *
     * @param root 1 <= root.size <= 25
     *             1 <= Node.val <= 2^31 - 1
     *             root.val == min(root.left.val, root.right.val) for
     *             each internal node of the tree.
     * @return the second minimum value.
     */
    int findSecondMinimumValue(TreeNode root);
}
