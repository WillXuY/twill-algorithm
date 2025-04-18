/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import common.provide.TreeNode;
import org.willxu.algorithm.service.integer.MaximumDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaximumDepthOfBinaryTreeLevel
        implements MaximumDepthOfBinaryTree {
    /**
     * calculate depth level by level
     *
     * @param root 0 <= root.size <= 10^4
     *             -100 <= Node.val <= 100
     * @return max depth
     */
    @Override
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<TreeNode> next = new ArrayList<>();
        while (level.size() > 0) {
            for (TreeNode t: level) {
                if (t.left != null) {
                    next.add(t.left);
                }
                if (t.right != null) {
                    next.add(t.right);
                }
            }
            level = next;
            next = new ArrayList<>();
            result++;
        }
        return result;
    }
}
