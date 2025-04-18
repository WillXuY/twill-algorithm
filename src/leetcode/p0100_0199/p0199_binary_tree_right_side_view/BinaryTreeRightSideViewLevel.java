package org.willxu.algorithm.service.impl.intlist;

import common.provide.TreeNode;
import org.willxu.algorithm.service.intlist.BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeRightSideViewLevel implements BinaryTreeRightSideView {
    @Override
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<Integer> result = new ArrayList<>();
        while (level.size() > 0) {
            List<TreeNode> nextLevel = new ArrayList<>();
            for (TreeNode l: level) {
                if (l.left != null) {
                    nextLevel.add(l.left);
                }
                if (l.right != null) {
                    nextLevel.add(l.right);
                }
            }
            result.add(level.get(level.size() - 1).val);
            level = nextLevel;
        }
        return result;
    }
}
