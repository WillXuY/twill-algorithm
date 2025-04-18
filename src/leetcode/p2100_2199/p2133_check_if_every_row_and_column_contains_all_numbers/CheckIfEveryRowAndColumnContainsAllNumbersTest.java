package leetcode.p2100_2199.p2133_check_if_every_row_and_column_contains_all_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfEveryRowAndColumnContainsAllNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}, true),
                arguments(new int[][] {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] matrix, boolean expected) {
        CheckIfEveryRowAndColumnContainsAllNumbers loop =
                new CheckIfEveryRowAndColumnContainsAllNumbersLoop();
        assertEquals(expected, loop.checkValid(matrix));
    }
}
