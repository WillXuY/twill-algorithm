/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.Node;
import org.willxu.algorithm.service.intlist.NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversalRecursive
        implements NaryTreePreorderTraversal {
    @Override
    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        if (root == null) {
            return output;
        }
        output.add(root.val);
        if (root.children == null || root.children.size() == 0) {
            return output;
        }
        for (Node n: root.children) {
            output.addAll(preorder(n));
        }
        return output;
    }
}
