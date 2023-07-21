package org.willxu.algorithm.domain.integer;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.integer.LinkedListRandomNodeList;
import org.willxu.algorithm.provide.ListNode;

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
