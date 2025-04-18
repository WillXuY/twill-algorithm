package leetcode.p0100_0199.p0129_sum_root_to_leaf_numbers;

import common.provide.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SumRootToLeafNumbersLevel implements SumRootToLeafNumbers {
    @Override
    public int sumNumbers(TreeNode root) {
        int result = 0;
        List<Integer> numList = new ArrayList<>();
        numList.add(root.val);
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        while (level.size() > 0) {
            List<Integer> nextNumList = new ArrayList<>();
            List<TreeNode> nextLevel = new ArrayList<>();
            for (int i = 0; i < level.size(); i++) {
                TreeNode node = level.get(i);
                int parentNum = numList.get(i);
                if (node.left == null) {
                    if (node.right == null) {
                        result += parentNum;
                    } else {
                        nextLevel.add(node.right);
                        nextNumList.add(parentNum * 10 + node.right.val);
                    }
                } else {
                    if (node.right == null) {
                        nextLevel.add(node.left);
                        nextNumList.add(parentNum * 10 + node.left.val);
                    } else {
                        nextLevel.add(node.right);
                        nextNumList.add(parentNum * 10 + node.right.val);
                        nextLevel.add(node.left);
                        nextNumList.add(parentNum * 10 + node.left.val);
                    }
                }
            }
            numList = nextNumList;
            level = nextLevel;
        }
        return result;
    }
}
