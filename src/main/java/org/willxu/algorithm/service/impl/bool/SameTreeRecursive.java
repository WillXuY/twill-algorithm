package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.exception.BreakException;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.bool.SameTree;

public class SameTreeRecursive implements SameTree {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        try {
            isSame(p, q);
        } catch (BreakException e) {
            return false;
        }
        return true;
    }

    private void isSame(TreeNode p, TreeNode q) throws BreakException {
        if (p == null && q == null) {
            return;
        } else if (p == null) {
            throw new BreakException();
        } else if (q == null) {
            throw new BreakException();
        }
        isSame(p.left, q.left);
        if (p.val != q.val) {
            throw new BreakException();
        }
        isSame(p.right, q.right);
    }
}
