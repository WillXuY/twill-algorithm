package org.willxu.algorithm.service.impl.integerlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integerlist.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeInorderTraversalRecursive
        implements BinaryTreeInorderTraversal {
    @Override
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> result = new ArrayList<>(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
}
