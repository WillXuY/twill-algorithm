package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.bool.LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTreesRecursive implements LeafSimilarTrees {
    /**
     * Recursive fetch the leaves of root1 and root2 and compare.
     */
    @Override
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return getLeaves(root1).equals(getLeaves(root2));
    }

    private List<Integer> getLeaves(TreeNode node) {
        List<Integer> leaves = new ArrayList<>();
        if (node == null) {
            return leaves;
        } else if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return leaves;
        }
        if (node.left != null) {
            leaves.addAll(getLeaves(node.left));
        }
        if (node.right != null) {
            leaves.addAll(getLeaves(node.right));
        }
        return leaves;
    }
}
