package common.provide.random;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public static Node generateByList(final List<List<Integer>> origin) {
        if (origin.size() == 0) {
            return null;
        }
        List<Integer> firstNum = origin.get(0);
        Node head = new Node(firstNum.get(0));
        Node node = head;
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(head);
        for (int i = 1; i < origin.size(); i++) {
            List<Integer> num = origin.get(i);
            Node n = new Node(num.get(0));
            node.next = n;
            nodeList.add(n);
            node = n;
        }
        for (int i = 0; i < origin.size(); i++) {
            Integer index = origin.get(i).get(1);
            if (index != null) {
                nodeList.get(i).random = nodeList.get(index);
            }
        }
        return head;
    }
}
