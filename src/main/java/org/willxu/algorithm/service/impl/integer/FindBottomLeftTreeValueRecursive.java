package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integer.FindBottomLeftTreeValue;

import java.util.ArrayList;
import java.util.List;

public class FindBottomLeftTreeValueRecursive
        implements FindBottomLeftTreeValue {
    @Override
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> levelLeftList = recursive(root);
        List<Integer> lastLevel = levelLeftList.get(levelLeftList.size() - 1);
        return lastLevel.get(0);
    }

    public List<List<Integer>> recursive(TreeNode node) {
        List<List<Integer>> levelLeftList = new ArrayList<>();
        if (node == null) {
            return levelLeftList;
        }
        List<Integer> thisLevel = new ArrayList<>();
        thisLevel.add(node.val);
        levelLeftList.add(thisLevel);
        levelLeftList.addAll(recursive(node.left));
        List<List<Integer>> subRight = recursive(node.right);
        for (int i = 1; i <= subRight.size(); i++) {
            if (i >= levelLeftList.size()) {
                levelLeftList.add(subRight.get(i - 1));
                continue;
            }
            List<Integer> level = levelLeftList.get(i);
            level.addAll(subRight.get(i - 1));
        }
        return levelLeftList;
    }
}
