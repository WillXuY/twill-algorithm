package leetcode.p1300_1399.p1394_find_luck_integer_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindLuckIntegerInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 2, 3, 4}, 2),
                arguments(new int[] {1, 2, 2, 3, 3, 3}, 3),
                arguments(new int[] {2, 2, 2, 3, 3}, -1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int expected) {
        FindLuckIntegerInAnArray count = new FindLuckIntegerInAnArrayCount();
        assertEquals(expected, count.findLucky(arr));
    }
}
