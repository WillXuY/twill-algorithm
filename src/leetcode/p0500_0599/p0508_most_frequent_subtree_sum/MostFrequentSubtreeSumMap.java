package leetcode.p0500_0599.p0508_most_frequent_subtree_sum;

import common.provide.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostFrequentSubtreeSumMap implements MostFrequentSubtreeSum {
    @Override
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> sumCountMap = recursive(root);
        sumCountMap.remove(Integer.MIN_VALUE);
        int maxSum = 0;
        Set<Integer> sumSet = new HashSet<>();
        for (int key: sumCountMap.keySet()) {
            int val = sumCountMap.get(key);
            if (maxSum < val) {
                maxSum = val;
                sumSet.clear();
                sumSet.add(key);
            } else if (maxSum == val) {
                sumSet.add(key);
            }
        }
        int[] result = new int[sumSet.size()];
        int i = 0;
        for (int s: sumSet) {
            result[i] = s;
            i++;
        }
        return result;
    }

    /**
     * @return sum's count and key Integer.MIN_VALUE's value is tree sum.
     */
    private Map<Integer, Integer> recursive(TreeNode node) {
        Map<Integer, Integer> sumCountMap = new HashMap<>();
        if (node == null) {
            return sumCountMap;
        } else if (node.left == null && node.right == null) {
            sumCountMap.put(node.val, 1);
            sumCountMap.put(Integer.MIN_VALUE, node.val);
            return sumCountMap;
        }
        Map<Integer, Integer> leftMap = recursive(node.left);
        Map<Integer, Integer> rightMap = recursive(node.right);
        int treeSum = node.val;
        if (!leftMap.isEmpty()) {
            treeSum += leftMap.get(Integer.MIN_VALUE);
        }
        if (!rightMap.isEmpty()) {
            treeSum += rightMap.get(Integer.MIN_VALUE);
        }
        leftMap.remove(Integer.MIN_VALUE);
        rightMap.remove(Integer.MIN_VALUE);
        sumCountMap.putAll(leftMap);
        for (int key: rightMap.keySet()) {
            int val = rightMap.get(key);
            if (sumCountMap.containsKey(key)) {
                sumCountMap.put(key, sumCountMap.get(key) + val);
            } else {
                sumCountMap.put(key, val);
            }
        }
        if (sumCountMap.containsKey(treeSum)) {
            sumCountMap.put(treeSum, sumCountMap.get(treeSum) + 1);
        } else {
            sumCountMap.put(treeSum, 1);
        }
        sumCountMap.put(Integer.MIN_VALUE, treeSum);
        return sumCountMap;
    }
}
