package org.willxu.algorithm.service.impl.bool;

import common.provide.TreeNode;
import org.willxu.algorithm.service.bool.RootEqualsSumOfChildren;

public class RootEqualsSumOfChildrenAdd implements RootEqualsSumOfChildren {
    @Override
    public boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }
}
