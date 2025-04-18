package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import leetcode.p1600_1699.p1656_design_an_ordered_stream.ListOrderedStream;

public class DesignAnOrderedStreamTest {
    @Test
    public void testList() {
        AbstractOrderedStream list = new ListOrderedStream(5);
        list.insert(3, "ccccc");
        list.insert(1, "aaaaa");
        list.insert(2, "bbbbb");
        list.insert(5, "eeeee");
        list.insert(4, "ddddd");
    }
}
