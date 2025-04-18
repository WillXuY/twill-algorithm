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
import org.willxu.algorithm.service.integer.SecondMinimumNodeInBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class SecondMinimumNodeInBinaryTreeLevel
        implements SecondMinimumNodeInBinaryTree {
    @Override
    public int findSecondMinimumValue(TreeNode root) {
        int min = -1;
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<TreeNode> next = new ArrayList<>();
            for (TreeNode t: level) {
                if (t.left != null) {
                    if (t.left.val != root.val) {
                        if (min == -1) {
                            min = t.left.val;
                        } else {
                            min = Math.min(min, t.left.val);
                        }
                    }
                    if (t.right.val != root.val){
                        if (min == -1) {
                            min = t.right.val;
                        } else {
                            min = Math.min(min, t.right.val);
                        }
                    }
                    next.add(t.left);
                    next.add(t.right);
                }
            }
            level = next;
        }
        return min;
    }
}
