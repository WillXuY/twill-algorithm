/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.provide;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * lever traversal, simplify the null node.
     *
     * Error 1: What the traversal leetcode use is level traversal
     * rather than preorder traversal.
     *
     * @param origin integer list simplify the null node
     * @return preorder traversal tree node
     */
    public static TreeNode initByListLevel(final List<Integer> origin) {
        if (origin == null || origin.size() == 0) {
            return null;
        } else if (origin.size() == 1) {
            return new TreeNode(origin.get(0));
        }
        int size = origin.size();
        TreeNode root = new TreeNode(origin.get(0));
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<TreeNode> next = new ArrayList<>();
        int levelUsedOrigin = 1;
        for (int i = levelUsedOrigin; i < size; i+= levelUsedOrigin) {
            levelUsedOrigin = 0;
            for (int j = 0; (j < level.size() * 2) && (j < size - i); j++) {
                Integer t = origin.get(i + j);
                if (t != null) {
                    TreeNode node = new TreeNode(origin.get(i + j));
                    int indexOfLevel = j / 2;
                    boolean leftNode = (j & 1) == 0;
                    if (leftNode) {
                        level.get(indexOfLevel).left = node;
                    } else {
                        level.get(indexOfLevel).right = node;
                    }
                    next.add(node);
                }
                levelUsedOrigin++;
            }
            level = next;
            next = new ArrayList<>();
        }
        return root;
    }
}
