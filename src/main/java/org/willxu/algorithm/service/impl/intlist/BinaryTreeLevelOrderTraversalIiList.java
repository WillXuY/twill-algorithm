package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.BinaryTreeLevelOrderTraversalIi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversalIiList
        implements BinaryTreeLevelOrderTraversalIi {
    @Override
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<Integer> valueList = new ArrayList<>();
            for (TreeNode l: level) {
                valueList.add(l.val);
                if (l.left != null) {
                    nextLevel.add(l.left);
                }
                if (l.right != null) {
                    nextLevel.add(l.right);
                }
            }
            result.add(0, valueList);
            level = nextLevel;
        }
        return result;
    }
}
