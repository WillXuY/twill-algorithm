package leetcode.p0100_0199.p0199_binary_tree_right_side_view;

import common.provide.TreeNode;

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
