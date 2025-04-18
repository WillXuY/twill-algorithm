package leetcode.p0300_0399.p0307_range_sum_query_mutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryMutableTest {
    @Test
    public void testArray() {
        int[] nums = new int[] {1, 3, 5};
        RangeSumQueryMutable array = new RangeSumQueryMutableArray(nums);
        assertEquals(9, array.sumRange(0, 2));
        array.update(1, 2);
        assertEquals(8, array.sumRange(0, 2));
    }
}
