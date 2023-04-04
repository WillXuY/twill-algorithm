package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalList
        implements BinaryTreeLevelOrderTraversal {
    @Override
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> levelList = new ArrayList<>();
        levelList.add(root);
        while (levelList.size() > 0) {
            List<Integer> r = new ArrayList<>();
            List<TreeNode> nextList = new ArrayList<>();
            for (TreeNode level: levelList) {
                r.add(level.val);
                if (level.left != null) {
                    nextList.add(level.left);
                }
                if (level.right != null) {
                    nextList.add(level.right);
                }
            }
            result.add(r);
            levelList = nextList;
        }
        return result;
    }
}
