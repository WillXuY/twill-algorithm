package leetcode.p1600_1699.p1609_even_odd_tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import common.provide.TreeNode;

public class EvenOddTreeRecursive implements EvenOddTree {

	@Override
	public boolean isEvenOddTree(TreeNode root) {
		List<List<Integer>> treeLevel = getLevelTree(root);
		if ((root.val & 1) == 0) {
			return false;
		}
		for (int l = 1; l < treeLevel.size(); l++) {
			List<Integer> level = treeLevel.get(l);
			if ((l & 1) == 1) {
				if ((level.get(0) & 1) == 1) {
					return false;
				}
			} else {
				if ((level.get(level.size() - 1) & 1) == 0) {
					return false;
				}
			}
			for (int i = 1; i < level.size(); i++) {
				int thisIndex = i;
				int lastIndex = i - 1;
				if ((l & 1) == 0) {
					lastIndex = level.size() - i;
					thisIndex = lastIndex - 1;
					if ((level.get(thisIndex) & 1) == 0) {
						return false;
					}
				} else {
					if ((level.get(thisIndex) & 1) == 1) {
						return false;
					}
				}
				if (level.get(thisIndex) >= level.get(lastIndex)) {
					return false;
				}
			}
		}
		return true;
	}

	private List<List<Integer>> getLevelTree(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> rootLevel = new ArrayList<>();
		rootLevel.add(root.val);
		result.add(rootLevel);
		List<List<Integer>> leftLevel = getLevelTree(root.left);
		List<List<Integer>> rightLevel = getLevelTree(root.right);
		if (leftLevel.size() < rightLevel.size()) {
			for (int i = 0; i < leftLevel.size(); i++) {
				List<Integer> thisLevel = leftLevel.get(i);
				thisLevel.addAll(rightLevel.get(i));
				result.add(thisLevel);
			}
			for (int i = leftLevel.size(); i < rightLevel.size(); i++) {
				result.add(rightLevel.get(i));
			}
		} else {
			for (int i = 0; i < rightLevel.size(); i++) {
				List<Integer> thisLevel = leftLevel.get(i);
				thisLevel.addAll(rightLevel.get(i));
				result.add(thisLevel);
			}
			for (int i = rightLevel.size(); i < leftLevel.size(); i++) {
				result.add(leftLevel.get(i));
			}
			
		}
		return result;
	}

}
