package org.willxu.algorithm.service.impl.integerlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integerlist.BinaryTreePostOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreePostOrderTraversalRecursive
        implements BinaryTreePostOrderTraversal {
    @Override
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> r = new ArrayList<>();
        r.addAll(postorderTraversal(root.left));
        r.addAll(postorderTraversal(root.right));
        r.add(root.val);
        return r;
    }
}
