/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.exception.BreakException;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.bool.BalancedBinaryTree;

public class BalancedBinaryTreeRecursive implements BalancedBinaryTree {
    @Override
    public boolean isBalanced(TreeNode root) {
        try {
            checkBalanced(root);
        } catch (BreakException e) {
            return false;
        }
        return true;
    }

    /**
     * check one node is balanced or not and return the depth of this
     * node.
     *
     * @param node this node
     * @return the depth of node
     * @throws BreakException break the recursive
     */
    private int checkBalanced(TreeNode node) throws BreakException {
        if (node == null) {
            return 0;
        }
        int left = checkBalanced(node.left);
        int right = checkBalanced(node.right);
        if (Math.abs(left - right) > 1) {
            throw new BreakException();
        }
        if (left > right) {
            return 1 + left;
        } else {
            return 1 + right;
        }
    }
}
