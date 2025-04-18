package leetcode.p0800_0899.p0876_middle_of_the_linked_list;

import common.provide.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfTheLinkedListRecursive implements MiddleOfTheLinkedList {
    /**
     * 1. Calculate the size of head.
     * 2. Recursive fetch the list of nodes.
     * 3. Compare number of calls and size of list.
     */
    @Override
    public ListNode middleNode(ListNode head) {
        List<ListNode> subList = getSubNodeList(head, 0);
        return subList.get(subList.size() - 1);
    }

    /**
     * 1. If node.size == 1;
     *    List.size == 1
     * 2. If node.size == 2;
     *    1) index == 0, list.size == 1;
     * 3. If node.size == 3;
     *    1) index == 1, list.size == 1;
     *    2) index == 0, list.size == 2;
     * 4. If node.size == 4;
     *    1) index == 2, list.size == 1;
     *    2) index == 1, list.size == 2;
     */
    public List<ListNode> getSubNodeList(ListNode node, int index) {
        List<ListNode> list = new ArrayList<>();
        if (node == null) {
            return list;
        } else if (node.next == null) {
            list.add(node);
            return list;
        }
        List<ListNode> subList = getSubNodeList(node.next, index + 1);
        if (index >= subList.size()) {
            subList.add(node);
        }
        return subList;
    }
}
