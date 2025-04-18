package leetcode.p1500_1599.p1578_minimum_time_to_make_rope_colorful;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumTimeToMakeRopeColorfulTest {
    static Stream<Arguments> dataProvider() {
    	return Stream.of(
    			arguments("abaac", new int[] {1, 2, 3, 4, 5}, 3),
    			arguments("abc", new int[] {1, 2, 3}, 0),
    			arguments("aabaa", new int[] {1, 2, 3, 4, 1}, 2)
    	);
    }
    
    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String colors, int[] neededTime, int expected) {
    	MinimumTimeToMakeRopeColorful stack = new MinimumTimeToMakeRopeColorfulStack();
    	assertEquals(expected, stack.minCost(colors, neededTime));
    }
}
