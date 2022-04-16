/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.BinaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePostOrderTraversalRecursive
        implements BinaryTreePostOrderTraversal {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> r = new ArrayList<>();
        r.addAll(postorderTraversal(root.left));
        r.addAll(postorderTraversal(root.right));
        r.add(root.val);
        return r;
    }
}
