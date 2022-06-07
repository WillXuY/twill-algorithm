package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.other.ListOrderedStream;

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
