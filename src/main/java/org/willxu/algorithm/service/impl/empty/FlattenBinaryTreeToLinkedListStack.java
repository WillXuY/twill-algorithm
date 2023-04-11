package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.empty.FlattenBinaryTreeToLinkedList;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedListStack
        implements FlattenBinaryTreeToLinkedList {
    @Override
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode result = null;
        TreeNode resultNode = null;
        Stack<TreeNode> leftNodeStack = new Stack<>();
        leftNodeStack.add(root);
        while (leftNodeStack.size() > 0) {
            Stack<TreeNode> nextLeftNodeStack = new Stack<>();
            nextLeftNodeStack.addAll(leftNodeStack);
            TreeNode node = nextLeftNodeStack.pop();
            if (node.right != null) {
                nextLeftNodeStack.push(node.right);
            }
            if (node.left != null) {
                nextLeftNodeStack.push(node.left);
            }
            TreeNode nextResult = new TreeNode(node.val);
            if (result == null) {
                result = nextResult;
                resultNode = result;
            } else {
                resultNode.right = nextResult;
                resultNode = nextResult;
            }
            leftNodeStack = nextLeftNodeStack;
        }
        root.right = result.right;
        root.left = null;
    }
}
