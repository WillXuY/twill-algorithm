package org.willxu.algorithm.service.impl.integer;

import common.provide.TreeNode;
import org.willxu.algorithm.service.integer.SumOfRootToLeafBinaryNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfRootToLeafBinaryNumbersRecursive
        implements SumOfRootToLeafBinaryNumbers {
    /**
     * 1. Recursive calculate the sum of sub node and get Level.
     *
     * @param root 1 <= root.size <= 1000
     *             Node.val is 0 or 1.
     * @return value.
     */
    @Override
    public int sumRootToLeaf(TreeNode root) {
        return getValueLevelAndSum(root).get(0);
    }

    /**
     *
     * @param node root node.
     * @return 0: Sum of node.val; 1~: branches' levels.
     */
    private List<Integer> getValueLevelAndSum(TreeNode node) {
        List<Integer> output = new ArrayList<>();
        int sum = 0;
        output.add(sum);
        if (node == null) {
            return output;
        } else if (node.left == null && node.right == null) {
            sum = node.val;
            output.set(0, sum);
            output.add(1);
            return output;
        }
        if (node.left != null) {
            List<Integer> left = getValueLevelAndSum(node.left);
            sum += left.get(0);
            for (int i = 1; i < left.size(); i++) {
                int level = left.get(i);
                sum += node.val * Math.pow(2, level);
                output.add(level + 1);
            }
        }
        if (node.right != null) {
            List<Integer> right = getValueLevelAndSum(node.right);
            sum += right.get(0);
            for (int i = 1; i < right.size(); i++) {
                int level = right.get(i);
                sum += node.val * Math.pow(2, level);
                output.add(level + 1);
            }
        }
        output.set(0, sum);
        return output;
    }
}
