/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.doublelist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.doublelist.AverageOfLevelsInBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class AverageOfLevelsInBinaryTreeLevel
        implements AverageOfLevelsInBinaryTree {
    @Override
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> output = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<TreeNode> next = new ArrayList<>();
            long count = 0L;
            for (TreeNode t: level) {
                count += t.val;
                if (t.left != null) {
                    next.add(t.left);
                }
                if (t.right != null) {
                    next.add(t.right);
                }
            }
            output.add((double)count / level.size());
            level = next;
        }
        return output;
    }
}
