package org.willxu.algorithm.domain.other;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.other.NumberOfRecentCallsTree;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfRecentCallsTest {
    /**
     * Each test case will call ping with strictly increasing value of t
     * At most 10^4 calls will be made to ping.
     */
    @Test
    public void test() {
        AbstractNumberOfRecentCalls tree = new NumberOfRecentCallsTree();
        assertEquals(1, tree.ping(1));
        assertEquals(2, tree.ping(100));
        assertEquals(3, tree.ping(3001));
        assertEquals(3, tree.ping(3002));
    }
}
