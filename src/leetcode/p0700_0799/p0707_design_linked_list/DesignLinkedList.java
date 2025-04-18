package leetcode.p0700_0799.p0707_design_linked_list;

/**
 * Design your implementation of the linked list. You can choose to use
 * a singly or doubly linked list.
 * <p>
 * A node in a singly linked list should have two attributes: val and
 * next. val is the value of the current node, and next is a
 * pointer/reference to the next node.
 * <p>
 * If you want to use the doubly linked list, you will need one more
 * attribute prev to indicate the previous node in the linked list.
 * Assume all nodes in the linked list are 0-indexed.
 * <p>
 * Implement the MyLinkedList class:
 * <p>
 * MyLinkedList() Initializes the MyLinkedList object.
 */
public interface DesignLinkedList {
    /**
     * Get the value of the index^th node in the linked list. If the
     * index is invalid, return -1.
     */
    int get(int index);

    /**
     * Add a node of value val before the first element of the linked
     * list. After the insertion, the new node will be the first node of
     * the linked list.
     */
    void addAtHead(int val);

    /**
     * Append a node of value val as the last element of the linked list.
     */
    void addAtTail(int val);

    /**
     * Add a node of value val before the index^th node in the linked
     * list. If index equals the length of the linked list, the node
     * will be appended to the end of the linked list. If index is
     * greater than the length, the node will not be inserted.
     */
    void addAtIndex(int index, int val);

    /**
     * Delete the index^th node in the linked list, if the index is
     * valid.
     */
    void deleteAtIndex(int index);
}
