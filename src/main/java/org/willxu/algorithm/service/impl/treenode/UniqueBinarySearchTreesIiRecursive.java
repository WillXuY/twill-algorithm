package org.willxu.algorithm.service.impl.treenode;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.treenode.UniqueBinarySearchTreesIi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueBinarySearchTreesIiRecursive
        implements UniqueBinarySearchTreesIi {
    @Override
    public List<TreeNode> generateTrees(int n) {
        List<Integer> remainList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            remainList.add(i);
        }
        return generate(remainList);
    }

    private List<TreeNode> generate(List<Integer> valList) {
        if (valList == null || valList.size() == 0) {
            return Collections.emptyList();
        }
        List<TreeNode> result = new ArrayList<>();
        for (int i = 0; i < valList.size(); i++) {
            int val = valList.get(i);
            List<TreeNode> leftNodeList = new ArrayList<>();
            List<TreeNode> rightNodeList = new ArrayList<>();
            if (i > 0) {
                List<Integer> leftList = valList.subList(0, i);
                leftNodeList = generate(leftList);
            }
            if (i < valList.size()) {
                List<Integer> rightList =
                        valList.subList(i + 1, valList.size());
                rightNodeList = generate(rightList);
            }
            if (leftNodeList.size() == 0) {
                if (rightNodeList.size() == 0) {
                    TreeNode root = new TreeNode(valList.get(i));
                    result.add(root);
                } else {
                    for (TreeNode right: rightNodeList) {
                        TreeNode root = new TreeNode(val);
                        root.right = right;
                        result.add(root);
                    }
                }
            } else {
                if (rightNodeList.size() == 0) {
                    for (TreeNode left: leftNodeList) {
                        TreeNode root = new TreeNode(val);
                        root.left = left;
                        result.add(root);
                    }
                } else {
                    for (TreeNode left: leftNodeList) {
                        for (TreeNode right : rightNodeList) {
                            TreeNode root = new TreeNode(val);
                            root.left = left;
                            root.right = right;
                            result.add(root);
                        }
                    }
                }
            }
        }
        return result;
    }
}
