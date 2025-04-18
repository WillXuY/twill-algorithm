/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import common.provide.TreeNode;
import org.willxu.algorithm.service.integer.MinimumDistanceBetweenBstNodes;

public class MinimumDistanceBetweenBstNodesRecursive
        implements MinimumDistanceBetweenBstNodes {
    @Override
    public int minDiffInBST(TreeNode root) {
        return getDiffLeftRight(root)[0];
    }

    /**
     * Recursive get the min diff, smallest value and largest value.
     *
     * @param node input node.
     * @return 0:min diff, 1:smallest value, 2:and largest value.
     */
    private int[] getDiffLeftRight(TreeNode node) {
        if (node == null) {
            return null;
        }
        int[] output = new int[3];
        output[0] = Integer.MAX_VALUE;
        output[1] = node.val;
        output[2] = node.val;
        if (node.left != null) {
            int[] left = getDiffLeftRight(node.left);
            output[1] = left[1];
            output[0] = node.val - left[2];
            if (left[0] != 0) {
                output[0] = Math.min(left[0], output[0]);
            }
        }
        if (node.right != null) {
            int[] right = getDiffLeftRight(node.right);
            output[2] = right[2];
            output[0] = Math.min(output[0], right[1] - node.val);
            if (right[0] != 0) {
                output[0] = Math.min(right[0], output[0]);
            }
        }
        return output;
    }
}
