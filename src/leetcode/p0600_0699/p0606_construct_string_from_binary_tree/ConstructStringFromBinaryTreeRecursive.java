/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0606_construct_string_from_binary_tree;

import common.provide.TreeNode;

public class ConstructStringFromBinaryTreeRecursive
        implements ConstructStringFromBinaryTree {
    @Override
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        } else if (root.left == null && root.right == null) {
            return String.valueOf(root.val);
        }
        String output = root.val + "(" + tree2str(root.left) + ")";
        if (root.right != null) {
            output += "(" + tree2str(root.right) + ")";
        }
        return output;
    }
}
