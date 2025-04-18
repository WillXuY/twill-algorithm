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
import org.willxu.algorithm.service.integer.BinaryTreeTilt;

public class BinaryTreeTiltRecursive implements BinaryTreeTilt {
    @Override
    public int findTilt(TreeNode root) {
        int[] sumAndTileSum = getSumAndTiltSum(root);
        return sumAndTileSum[1];
    }

    /**
     * Get the node's sum and tilt's sum.
     *
     * @param node binary tree's node
     * @return int[0] is sum, int[1] is sum of tilt
     */
    private int[] getSumAndTiltSum(TreeNode node) {
        int[] sumAndTiltSum = new int[2];
        if (node == null) {
            return sumAndTiltSum;
        } else if (node.left == null && node.right == null) {
            sumAndTiltSum[0] = node.val;
            return sumAndTiltSum;
        }
        int[] left = getSumAndTiltSum(node.left);
        int[] right = getSumAndTiltSum(node.right);
        sumAndTiltSum[0] = left[0] + right[0] + node.val;
        int tilt;
        if (left[0] > right[0]) {
            tilt = left[0] - right[0];
        } else {
            tilt = right[0] - left[0];
        }
        sumAndTiltSum[1] = left[1] + right[1] + tilt;
        return sumAndTiltSum;
    }
}
