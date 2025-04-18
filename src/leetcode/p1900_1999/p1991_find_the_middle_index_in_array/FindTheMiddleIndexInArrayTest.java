package leetcode.p1900_1999.p1991_find_the_middle_index_in_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheMiddleIndexInArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 3, -1, 8, 4}, 3),
                arguments(new int[] {1, -1, 4}, 2),
                arguments(new int[] {2, 5}, -1)
        );
    }

    @ParameterizedTest(name = "Sum {index}")
    @MethodSource("dataProvider")
    public void testSum(int[] nums, int expected) {
        FindTheMiddleIndexInArray sum = new FindTheMiddleIndexInArraySum();
        assertEquals(expected, sum.findMiddleIndex(nums));
    }
}
