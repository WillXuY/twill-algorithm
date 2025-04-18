package org.willxu.algorithm.service.impl.integer;

import common.provide.TreeNode;
import org.willxu.algorithm.service.integer.CountCompleteTreeNodes;

import java.util.ArrayList;
import java.util.List;

public class CountCompleteTreeNodesList implements CountCompleteTreeNodes {
    @Override
    public int countNodes(TreeNode root) {
        int result = 0;
        if (root == null) {
            return result;
        }
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<TreeNode> nextLevel = new ArrayList<>();
            for (TreeNode t: level) {
                result++;
                if (t.left != null) {
                    nextLevel.add(t.left);
                }
                if (t.right != null) {
                    nextLevel.add(t.right);
                }
            }
            level = nextLevel;
        }
        return result;
    }
}
