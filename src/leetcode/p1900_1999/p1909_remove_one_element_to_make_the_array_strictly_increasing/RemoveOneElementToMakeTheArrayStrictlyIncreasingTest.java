package leetcode.p1900_1999.p1909_remove_one_element_to_make_the_array_strictly_increasing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveOneElementToMakeTheArrayStrictlyIncreasingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {105, 924, 32, 968}, true),
                arguments(new int[] {1, 2, 10, 5, 7}, true),
                arguments(new int[] {2, 3, 1, 2}, false),
                arguments(new int[] {1, 1, 1}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean expected) {
        RemoveOneElementToMakeTheArrayStrictlyIncreasing loop =
                new RemoveOneElementToMakeTheArrayStrictlyIncreasingLoop();
        assertEquals(expected, loop.canBeIncreasing(nums));
    }
}
