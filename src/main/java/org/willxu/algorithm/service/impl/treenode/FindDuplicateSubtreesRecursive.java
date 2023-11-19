package org.willxu.algorithm.service.impl.treenode;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.treenode.FindDuplicateSubtrees;

import java.util.*;

public class FindDuplicateSubtreesRecursive implements FindDuplicateSubtrees {
    @Override
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        Map<String, String> treeCount = recursive(root);
        treeCount.remove("self");
        for (String key: treeCount.keySet()) {
            String value = treeCount.get(key);
            int count = Integer.parseInt(value);
            if (count < 2) {
                continue;
            }
            TreeNode node = parseNode(key);
            result.add(node);
        }
        return result;
    }

    /**
     * @param key 1-2-4-null-null-null-3-2-4-null-null-null-4-null-null
     * @return Pre-order traversal
     */
    private TreeNode parseNode(String key) {
        String[] values = key.split("#");
        Integer[] preOrder = new Integer[values.length];
        for (int i = 0; i < values.length; i++) {
            if ("null".equals(values[i])) {
                preOrder[i] = null;
            } else {
                preOrder[i] = Integer.parseInt(values[i]);
            }
        }
        return createTree(preOrder).node;
    }

    private CreateTreeResult createTree(Integer[] preOrder) {
        if (preOrder.length == 0) {
            return new CreateTreeResult(null, 0);
        }
        Integer rootVal = preOrder[0];
        if (rootVal == null) {
            return new CreateTreeResult(null, 1);
        }
        TreeNode root = new TreeNode(rootVal);
        Integer[] leftPreOrder = Arrays.copyOfRange(
                preOrder, 1, preOrder.length);
        CreateTreeResult left = createTree(leftPreOrder);
        int used = 1 + left.used;
        Integer[] rightPreOrder = Arrays.copyOfRange(
                preOrder, used, preOrder.length);
        CreateTreeResult right = createTree(rightPreOrder);
        root.left = left.node;
        root.right = right.node;
        return new CreateTreeResult(root, used + right.used);
    }

    private static class CreateTreeResult{
        public TreeNode node;
        public int used;

        public CreateTreeResult(TreeNode node, int used) {
            this.node = node;
            this.used = used;
        }
    }

    private Map<String, String> recursive(TreeNode node) {
        Map<String, String> result = new HashMap<>();
        if (node == null) {
            return result;
        }
        StringBuilder self = new StringBuilder();
        self.append(node.val).append('#');
        Map<String, String> left = recursive(node.left);
        Map<String, String> right = recursive(node.right);
        self.append(left.get("self")).append('#').append(right.get("self"));
        while (self.charAt(self.length() - 1) == '#') {
            self.deleteCharAt(self.length() - 1);
        }
        left.remove("self");
        right.remove("self");
        result.put("self", self.toString());
        result.put(self.toString(), "1");
        result = countAddAll(result, left);
        result = countAddAll(result, right);
        return result;
    }

    private Map<String, String> countAddAll(Map<String, String> first,
                                            Map<String, String> second) {
        Map<String, String> result = new HashMap<>(first);
        for (String key : second.keySet()) {
            if (result.containsKey(key)) {
                int count = Integer.parseInt(second.get(key))
                        + Integer.parseInt(result.get(key));
                result.put(key, String.valueOf(count));
            } else {
                result.put(key, second.get(key));
            }
        }
        return result;
    }
}
