package leetcode.p1300_1399.p1379_find_corresponding_node_of_binary_tree_in_clone_of_that_tree;

import common.provide.TreeNode;

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
