package leetcode.p1500_1599.p1590_make_sum_divisible_by_ptest;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p1500_1599.p1590_make_sum_divisible_by_ptest.MakeSumDivisibleByPsum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeSumDivisibleByPtest {
    static Stream<Arguments> dataProvider() {
    	return Stream.of(
    			arguments(new int[] {1000000000,1000000000,1000000000}, 3, 0),
    			arguments(new int[] {3, 1, 4, 2}, 6, 1),
    			arguments(new int[] {6, 3, 5, 2}, 9, 2),
    			arguments(new int[] {1, 2, 3}, 3, 0)
    	);
    }
    
    @ParameterizedTest(name = "Sum {index}")
    @MethodSource("dataProvider")
    public void testSum(int[] nums, int p, int expected) {
    	MakeSumDivisibleByP sum = new MakeSumDivisibleByPsum();
    	assertEquals(expected, sum.minSubarray(nums, p));
    }
}
