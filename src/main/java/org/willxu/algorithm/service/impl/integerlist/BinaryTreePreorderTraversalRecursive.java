package org.willxu.algorithm.service.impl.integerlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integerlist.BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePreorderTraversalRecursive
        implements BinaryTreePreorderTraversal {
    @Override
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> r = new ArrayList<>();
        r.add(root.val);
        r.addAll(preorderTraversal(root.left));
        r.addAll(preorderTraversal(root.right));
        return r;
    }
}
