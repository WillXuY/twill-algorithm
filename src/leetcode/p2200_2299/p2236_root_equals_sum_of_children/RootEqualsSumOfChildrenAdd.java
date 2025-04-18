package leetcode.p2200_2299.p2236_root_equals_sum_of_children;

import common.provide.TreeNode;

public class RootEqualsSumOfChildrenAdd implements RootEqualsSumOfChildren {
    @Override
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
