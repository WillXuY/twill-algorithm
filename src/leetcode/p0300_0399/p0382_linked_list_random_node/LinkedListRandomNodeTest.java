package leetcode.p0300_0399.p0382_linked_list_random_node;

import org.junit.jupiter.api.Test;

import common.provide.ListNode;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListRandomNodeTest {
    @Test
    public void testList() {
        Set<Integer> set = Stream.of(1, 2, 3).collect(Collectors.toSet());
        ListNode listNode = ListNode.getListNodeFromIntArray(new int[] {
                1, 2, 3
        });
        LinkedListRandomNode list = new LinkedListRandomNodeList(listNode);
        assertTrue(set.contains(list.getRandom()));
        assertTrue(set.contains(list.getRandom()));
        assertTrue(set.contains(list.getRandom()));
        assertTrue(set.contains(list.getRandom()));
    }
}
