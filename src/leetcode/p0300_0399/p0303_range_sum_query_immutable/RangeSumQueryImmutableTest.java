package leetcode.p0300_0399.p0303_range_sum_query_immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutableTest {
    /**
     * At most 10^4 calls will be made to sumRange.
     */
    @Test
    public void testCycle() {
        int[] input = new int[] {-2, 0, 3, -5, 2, -1};
        AbstractNumArray cycle = new NumArrayCycle(input);
        assertEquals(1, cycle.sumRange(0, 2));
        assertEquals(-1, cycle.sumRange(2, 5));
        assertEquals(-3, cycle.sumRange(0, 5));
    }
}
