package leetcode.p0300_0399.p0380_insert_delete_get_random_o1;

import org.junit.jupiter.api.Test;

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
