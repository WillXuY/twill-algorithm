package leetcode.p0700_0799.p0707_design_linked_list;

public class DesignLinkedListNode implements DesignLinkedList {
    private static class Node {
        public int val;
        public Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node first = null;

    private int size = 0;

    private Node tail = null;

    @Override
    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        int i = 0;
        Node n = first;
        while (n != null) {
            if (i == index) {
                return n.val;
            }
            i++;
            n = n.next;
        }
        return -1;
    }

    @Override
    public void addAtHead(int val) {
        if (size == 0) {
            first = new Node(val, null);
            tail = first;
            size = 1;
        } else {
            first = new Node(val, first);
            size++;
        }
    }

    @Override
    public void addAtTail(int val) {
        if (size == 0) {
            first = new Node(val, null);
            tail = first;
            size = 1;
        } else {
            Node n = new Node(val, null);
            tail.next = n;
            tail = n;
            size++;
        }
    }

    @Override
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index == size) {
            addAtTail(val);
            return;
        }
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node n = first;
        int i = 0;
        while (n != null) {
            if (i == index - 1) {
                n.next = new Node(val, n.next);
                size++;
                return;
            }
            i++;
            n = n.next;
        }
    }

    @Override
    public void deleteAtIndex(int index) {
        if (index >= size) {
            return;
        }
        if (index == 0) {
            first = first.next;
            size--;
            if (size <= 1) {
                tail = first;
            }
            return;
        }
        int i = 0;
        Node n = first;
        while (n != null) {
            if (i == index - 1) {
                n.next = n.next.next;
                size--;
                if (index == size) {
                    tail = n;
                }
                return;
            }
            i++;
            n = n.next;
        }
    }
}
