package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integer.MinimumDepthOrBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDepthOfBinaryTreeLevel implements MinimumDepthOrBinaryTree {
    @Override
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<TreeNode> next = new ArrayList<>();
        int r = 0;
        while (level.size() > 0) {
            for (TreeNode t: level) {
                if (t.left == null && t.right == null) {
                    next = new ArrayList<>();
                    break;
                }
                if (t.left != null) {
                    next.add(t.left);
                }
                if (t.right != null) {
                    next.add(t.right);
                }
            }
            level = next;
            next = new ArrayList<>();
            r++;
        }
        return r;
    }
}
