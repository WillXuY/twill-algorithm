/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.provide;

import java.util.ArrayList;
import java.util.List;

/**
 * Node is a N-ary tree
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

    public static Node getNodeByList(List<Integer> origin) {
        if (origin == null || origin.size() < 1) {
            return null;
        }
        Node root = new Node(origin.get(0));
        List<Node> level = new ArrayList<>();
        int levelIndex = 0;
        List<Node> nextLevel = new ArrayList<>();
        nextLevel.add(root);
        List<Node> children = new ArrayList<>();
        for (int i = 1; i < origin.size(); i++) {
            if (origin.get(i) == null) {
                if (level.size() != 0) {
                    // add children to the last level node.
                    level.get(levelIndex).children = children;
                }
                nextLevel.addAll(children);
                // the next node's children
                children = new ArrayList<>();
                levelIndex++;
                if (levelIndex >= level.size()) {
                    levelIndex = 0;
                    level = nextLevel;
                    nextLevel = new ArrayList<>();
                }
            } else {
                Node n = new Node(origin.get(i));
                children.add(n);
            }
        }
        level.get(levelIndex).children = children;
        return root;
    }
}
