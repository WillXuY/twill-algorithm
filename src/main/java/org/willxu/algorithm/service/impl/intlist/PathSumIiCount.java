package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.intlist.PathSumIi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathSumIiCount implements PathSumIi {
    @Override
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return Collections.emptyList();
        }
        List<Integer> countList = new ArrayList<>();
        countList.add(root.val);
        List<List<TreeNode>> pathList = new ArrayList<>();
        List<TreeNode> rootPath = new ArrayList<>();
        rootPath.add(root);
        pathList.add(rootPath);
        while (pathList.size() > 0) {
            List<List<TreeNode>> nextPathList = new ArrayList<>();
            List<Integer> nextCountList = new ArrayList<>();
            for (int i = 0; i < pathList.size(); i++) {
                List<TreeNode> path = pathList.get(i);
                TreeNode node = path.get(path.size() - 1);
                int count = countList.get(i);
                if (node.left == null && node.right == null
                        && count == targetSum) {
                    List<Integer> r = new ArrayList<>();
                    for (TreeNode p: path) {
                        r.add(p.val);
                    }
                    result.add(r);
                }
                if (node.left != null) {
                    int leftCount = count + node.left.val;
                    List<TreeNode> nextPath = new ArrayList<>(path);
                    nextPath.add(node.left);
                    nextPathList.add(nextPath);
                    nextCountList.add(leftCount);
                }
                if (node.right != null) {
                    int rightCount = count + node.right.val;
                    List<TreeNode> nextPath = new ArrayList<>(path);
                    nextPath.add(node.right);
                    nextPathList.add(nextPath);
                    nextCountList.add(rightCount);
                }
            }
            pathList = nextPathList;
            countList = nextCountList;
        }
        return result;
    }
}
