package org.willxu.algorithm.provide;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * lever traversal, simplify the null node.
     *
     * Error 1: What the traversal leetcode use is level traversal
     * rather than preorder traversal.
     *
     * @param origin integer list simplify the null node
     * @return preorder traversal tree node
     */
    public static TreeNode initByListLevel(List<Integer> origin) {
        if (origin == null || origin.size() == 0) {
            return null;
        } else if (origin.size() == 1) {
            return new TreeNode(origin.get(0));
        }
        TreeNode root = new TreeNode(origin.get(0));
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        List<TreeNode> next = new ArrayList<>();
        for (int i = 1; i < origin.size(); i+= level.size()) {
            for (int j = 0; j < level.size() * 2; j++) {
                if (i + j >= origin.size()) {
                    continue;
                }
                Integer t = origin.get(i + j);
                if (t != null) {
                    TreeNode node = new TreeNode(origin.get(i + j));
                    int indexOfLevel = j / 2;
                    boolean leftNode = (j & 1) == 0;
                    if (leftNode) {
                        level.get(indexOfLevel).left = node;
                    } else {
                        level.get(indexOfLevel).right = node;
                    }
                    next.add(node);
                }
                if (i + j >= origin.size() - 1) {
                    i = origin.size();
                    j = level.size() * 2;
                }
            }
            level = next;
            next = new ArrayList<>();
        }
        return root;
    }
}
