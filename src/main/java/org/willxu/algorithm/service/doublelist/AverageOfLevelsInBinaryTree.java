/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.doublelist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface AverageOfLevelsInBinaryTree {
    /**
     * Given the root of a binary tree, return the average value of the
     * nodes on each level in the form of an array. Answers within 10^-5
     * of the actual answer will be accepted.
     *
     * @param root 1 <= root.size <= 10^4
     *             -2^31 <= Node.val <= 2^31 - 1
     * @return average of levels.
     */
    List<Double> averageOfLevels(TreeNode root);
}
