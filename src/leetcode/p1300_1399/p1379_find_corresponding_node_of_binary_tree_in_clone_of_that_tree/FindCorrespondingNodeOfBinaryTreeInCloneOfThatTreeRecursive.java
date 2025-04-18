package org.willxu.algorithm.service.impl.treenode;

import common.provide.TreeNode;
import org.willxu.algorithm.service.treenode.FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree;

public class FindCorrespondingNodeOfBinaryTreeInCloneOfThatTreeRecursive
        implements FindCorrespondingNodeOfBinaryTreeInCloneOfThatTree {
    @Override
    public TreeNode getTargetCopy(
            TreeNode original, TreeNode cloned, TreeNode target) {
        if (cloned.val == target.val) {
            return cloned;
        }
        if (cloned.left != null) {
            TreeNode leftCheck = getTargetCopy(
                    original.left, cloned.left, target);
            if (leftCheck != null) {
                return leftCheck;
            }
        }
        if (cloned.right != null) {
            return getTargetCopy(original.right, cloned.right, target);
        }
        return null;
    }
}
