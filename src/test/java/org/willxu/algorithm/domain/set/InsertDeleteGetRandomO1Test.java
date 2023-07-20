package org.willxu.algorithm.domain.set;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.set.InsertDeleteGetRandomO1Set;

import static org.junit.jupiter.api.Assertions.*;

public class InsertDeleteGetRandomO1Test {
    @Test
    public void testSet() {
        InsertDeleteGetRandomO1 set = new InsertDeleteGetRandomO1Set();
        assertTrue(set.insert(1));
        assertFalse(set.remove(2));
        assertTrue(set.insert(2));
        assertEquals(1, set.getRandom());
        assertTrue(set.remove(1));
        assertFalse(set.insert(2));
        assertEquals(2, set.getRandom());
    }
}
