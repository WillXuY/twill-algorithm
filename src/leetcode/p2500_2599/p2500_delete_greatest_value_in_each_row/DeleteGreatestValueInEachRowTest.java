package leetcode.p2500_2599.p2500_delete_greatest_value_in_each_row;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DeleteGreatestValueInEachRowTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2, 4}, {3, 3, 1}}, 8),
                arguments(new int[][] {{10}}, 10)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] grid, int expected) {
        DeleteGreatestValueInEachRow sort =
                new DeleteGreatestValueInEachRowSort();
        assertEquals(expected, sort.deleteGreatestValue(grid));
    }
}
