package org.willxu.algorithm.service.impl.treenode;

import common.provide.ListNode;
import common.provide.TreeNode;
import org.willxu.algorithm.service.treenode.ConvertSortedListToBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ConvertSortedListToBinarySearchTreeList
        implements ConvertSortedListToBinarySearchTree {
    @Override
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        List<Integer> orderedList = new ArrayList<>();
        while (head != null) {
            orderedList.add(head.val);
            head = head.next;
        }
        int halfIndex = orderedList.size() / 2;
        TreeNode result = new TreeNode(orderedList.get(halfIndex));
        List<TreeNode> level = new ArrayList<>();
        level.add(result);
        List<int[]> indexList = new ArrayList<>();
        indexList.add(new int[] {0, orderedList.size() - 1, halfIndex});
        while (level.size() > 0) {
            List<TreeNode> nextLevel = new ArrayList<>();
            List<int[]> nextIndex = new ArrayList<>();
            for (int i = 0; i < level.size(); i++) {
                TreeNode node = level.get(i);
                int[] startEndHalf = indexList.get(i);
                int leftStart = startEndHalf[0];
                int leftEnd = startEndHalf[2] - 1;
                if (leftStart == leftEnd) {
                    node.left = new TreeNode(orderedList.get(leftEnd));
                } else if (leftStart < leftEnd) {
                    int leftHalf = (leftStart + leftEnd) / 2;
                    TreeNode left = new TreeNode(orderedList.get(leftHalf));
                    node.left = left;
                    nextLevel.add(left);
                    nextIndex.add(new int[] {leftStart, leftEnd, leftHalf});
                }
                int rightStart = startEndHalf[2] + 1;
                int rightEnd = startEndHalf[1];
                if (rightEnd == rightStart) {
                    node.right = new TreeNode(orderedList.get(rightEnd));
                } else if (rightEnd > rightStart) {
                    int rightHalf = (rightStart + rightEnd) / 2;
                    TreeNode right = new TreeNode(orderedList.get(rightHalf));
                    node.right = right;
                    nextLevel.add(right);
                    nextIndex.add(new int[] {rightStart, rightEnd, rightHalf});
                }
            }
            indexList = nextIndex;
            level = nextLevel;
        }
        return result;
    }
}
