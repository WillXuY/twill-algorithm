package leetcode.p1300_1399.p1380_lucky_numbers_in_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LuckyNumbersInMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}},
                        Stream.of(15).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {
                                {1, 10, 4, 2},
                                {9, 3, 8, 7},
                                {15, 16, 17, 12}
                        },
                        Stream.of(12).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{7, 8}, {1, 2}},
                        Stream.of(7).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] matrix, List<Integer> expected) {
        LuckyNumbersInMatrix loop = new LuckyNumbersInMatrixLoop();
        assertArrayEquals(expected.toArray(),
                loop.luckyNumbers(matrix).toArray());
    }
}
