/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.provide.Node;
import org.willxu.algorithm.service.integer.MaximumDepthOfNaryTree;

public class MaximumDepthOfNaryTreeRecursive implements MaximumDepthOfNaryTree {
    @Override
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children == null || root.children.size() == 0) {
            return 1;
        }
        int max = 0;
        for (Node n: root.children) {
            int depth = maxDepth(n) + 1;
            if (depth > max) {
                max = depth;
            }
        }
        return max;
    }
}
