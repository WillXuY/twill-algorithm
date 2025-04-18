/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0590_nary_tree_postorder_traversal;

import common.provide.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversalRecursive
        implements NaryTreePostorderTraversal {
    @Override
    public List<Integer> postorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        if (root.children == null || root.children.size() == 0) {
            output.add(root.val);
            return output;
        }
        for (Node n: root.children) {
            output.addAll(postorder(n));
        }
        output.add(root.val);
        return output;
    }
}
