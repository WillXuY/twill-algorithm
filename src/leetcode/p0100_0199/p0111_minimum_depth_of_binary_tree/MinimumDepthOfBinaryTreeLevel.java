/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0111_minimum_depth_of_binary_tree;

import common.provide.TreeNode;
import leetcode.p0100_0199.p0111_minimum_depth_of_binary_tree.MinimumDepthOrBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTreeLevel implements MinimumDepthOrBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<TreeNode> next = new ArrayList<>();
        int r = 0;
        while (level.size() > 0) {
            for (TreeNode t: level) {
                if (t.left == null && t.right == null) {
                    next = new ArrayList<>();
                    break;
                }
                if (t.left != null) {
                    next.add(t.left);
                }
                if (t.right != null) {
                    next.add(t.right);
                }
            }
            level = next;
            next = new ArrayList<>();
            r++;
        }
        return r;
    }
}
