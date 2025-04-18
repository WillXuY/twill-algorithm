package org.willxu.algorithm.service.impl.ints;

import common.provide.TreeNode;
import org.willxu.algorithm.service.ints.FindModeInBinarySearchTree;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FindModeInBinarySearchTreeRecursive
        implements FindModeInBinarySearchTree {
    @Override
    public int[] findMode(TreeNode root) {
        TreeMap<Integer, Integer> frequent = findFrequentlyElements(root);
        Set<Integer> outputSet = new TreeSet<>();
        int max = -1;
        for (int i: frequent.keySet()) {
            int contains = frequent.get(i);
            if (max == -1) {
                max = contains;
            }
            if (max == contains) {
                outputSet.add(i);
            } else if (max < contains) {
                outputSet.clear();
                outputSet.add(i);
                max = contains;
            }
        }
        int[] output = new int[outputSet.size()];
        int index = 0;
        for (int i: outputSet) {
            output[index] = i;
            index++;
        }
        return output;
    }

    private TreeMap<Integer, Integer> findFrequentlyElements(TreeNode node) {
        TreeMap<Integer, Integer> output = new TreeMap<>();
        if (node.right == null && node.left == null){
            output.put(node.val, 1);
            return output;
        }
        TreeMap<Integer, Integer> left = new TreeMap<>();
        if (node.left != null) {
            left = findFrequentlyElements(node.left);
            output.putAll(left);
        }
        TreeMap<Integer, Integer> right = new TreeMap<>();
        if (node.right != null) {
            right = findFrequentlyElements(node.right);
            output.putAll(right);
        }
        // left and right may contains same element.
        if (left.size() > 0 && right.size() > 0) {
            if (left.lastKey().equals(right.firstKey())) {
                output.put(left.lastKey(), left.lastEntry().getValue()
                        + right.firstEntry().getValue());
            }
        }
        if (output.containsKey(node.val)) {
            output.put(node.val, output.get(node.val) + 1);
        } else {
            output.put(node.val, 1);
        }
        return output;
    }
}
