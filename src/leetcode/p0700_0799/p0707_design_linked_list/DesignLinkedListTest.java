package leetcode.p0700_0799.p0707_design_linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DesignLinkedListTest {
    @Test
    public void testNode() {
        DesignLinkedList node = new DesignLinkedListNode();
        node.addAtHead(1);
        node.addAtTail(3);
        node.addAtIndex(1, 2);
        assertEquals(2, node.get(1));
        node.deleteAtIndex(1);
        assertEquals(3, node.get(1));
    }

    @Test
    public void testNode2() {
        DesignLinkedList node = new DesignLinkedListNode();
        node.addAtHead(84);
        node.addAtTail(2);
        node.addAtTail(39);
        node.get(3);
        node.get(1);
        node.addAtTail(42);
        node.addAtIndex(1, 80);
        node.addAtHead(14);
        node.addAtHead(1);
        node.addAtTail(53);
        node.addAtTail(98);
        node.addAtTail(19);
        node.addAtTail(12);
        node.get(2);
        node.addAtHead(16);
        node.addAtHead(33);
        node.addAtIndex(4, 17);
        node.addAtIndex(6, 8);
        node.addAtHead(37);
        node.addAtTail(43);
        node.deleteAtIndex(11);
        node.addAtHead(80);
        node.addAtHead(31);
        node.addAtIndex(13, 23);
        node.addAtTail(17);
        node.get(4);
        node.addAtIndex(10, 0);
        node.addAtTail(21);
        node.addAtHead(73);
        node.addAtHead(22);
        node.addAtIndex(24, 37);
        node.addAtTail(14);
        node.addAtHead(97);
        node.addAtHead(8);
        node.get(6);
        node.deleteAtIndex(17);
        node.addAtTail(50);
        node.addAtTail(28);
        node.addAtHead(76);
        node.addAtTail(79);
        node.get(18);
        node.deleteAtIndex(30);
        node.addAtTail(5);
        node.addAtHead(9);
        node.addAtTail(83);
        node.deleteAtIndex(3);
        node.addAtTail(40);
        node.deleteAtIndex(26);
        node.addAtIndex(20, 90);
        node.deleteAtIndex(30);
        node.addAtTail(40);
        node.addAtHead(56);
        node.addAtIndex(15, 23);
        node.addAtHead(51);
        node.addAtHead(21);
        node.get(26);
        node.addAtHead(83);
        node.get(30);
        node.addAtHead(12);
        node.deleteAtIndex(8);
        node.get(4);
        node.addAtHead(20);
        node.addAtTail(45);
        node.get(10);
        node.addAtHead(56);
        node.get(18);
        node.addAtTail(33);
        node.get(2);
        node.addAtTail(70);
        node.addAtHead(57);
        node.addAtIndex(31, 24);
        node.addAtIndex(16, 92);
        node.addAtHead(40);
        node.addAtHead(23);
        node.deleteAtIndex(26);
        node.get(1);
        node.addAtHead(92);
        node.addAtIndex(3, 78);
        node.addAtTail(42);
        node.get(18);
        node.addAtIndex(39, 9);
        node.get(13);
        node.addAtIndex(33, 17);
        node.get(51);
        node.addAtIndex(18, 95);
        node.addAtIndex(18, 33);
        node.addAtHead(80);
        node.addAtHead(21);
        node.addAtTail(7);
        node.addAtIndex(17, 46);
        node.get(33);
        node.addAtHead(60);
        node.addAtTail(26);
        node.addAtTail(4);
        node.addAtHead(9);
        node.get(45);
        node.addAtTail(38);
        node.addAtHead(95);
        node.addAtTail(78);
        node.get(54);
        node.addAtIndex(42, 86);
    }
}
