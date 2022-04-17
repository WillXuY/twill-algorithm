/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.strlist.BinaryTreePaths;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePathsRecursive implements BinaryTreePaths {
    @Override
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> routes = new ArrayList<>();
        if (root == null) {
            return routes;
        }
        if (root.left == null && root.right == null) {
            routes.add(String.valueOf(root.val));
            return routes;
        }
        if (root.left != null) {
            List<String> left = binaryTreePaths(root.left);
            for (String s: left) {
                routes.add(root.val + "->" + s);
            }
        }
        if (root.right != null) {
            List<String> right = binaryTreePaths(root.right);
            for (String s: right) {
                routes.add(root.val + "->" +s);
            }
        }
        return routes;
    }
}
