package org.willxu.algorithm.service.impl.integer;

import common.provide.TreeNode;
import org.willxu.algorithm.service.integer.DiameterOfBinaryTree;

public class DiameterOfBinaryTreeRecursive implements DiameterOfBinaryTree {
    @Override
    public int diameterOfBinaryTree(TreeNode root) {
        int[] longestBranchAndDiameter = getLongestBranchAndDiameter(root);
        return longestBranchAndDiameter[1];
    }

    /**
     * @param node the recursive node
     * @return int[0] the length of longest Branch
     *         int[1] the Diameter
     */
    private int[] getLongestBranchAndDiameter(TreeNode node) {
        int[] output = new int[2];
        boolean hasLeft = node.left != null;
        boolean hasRight = node.right != null;
        if (!hasLeft && !hasRight) {
            return output;
        }
        int[] left = new int[2];
        int[] right = new int[2];
        int diameter = 0;
        if (hasLeft) {
            left = getLongestBranchAndDiameter(node.left);
            diameter += left[0] + 1;
            output[0] = left[0] + 1;
        }
        if (hasRight) {
            right = getLongestBranchAndDiameter(node.right);
            diameter += right[0] + 1;
            if (output[0] < right[0] + 1) {
                output[0] = right[0] + 1;
            }
        }
        if (diameter < left[1]) {
            diameter = left[1];
        }
        if (diameter < right[1]) {
            diameter = right[1];
        }
        output[1] = diameter;
        return output;
    }
}
