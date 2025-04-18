package leetcode.p1700_1799.p1725_number_of_rectangles_that_can_form_the_largest_square;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfRectanglesThatCanFormTheLargestSquareTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{5, 8}, {3, 9}, {5, 12}, {16, 5}}, 3),
                arguments(new int[][] {{2, 3}, {3, 7}, {4, 3}, {3, 7}}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] rectangles, int expected) {
        NumberOfRectanglesThatCanFormTheLargestSquare loop =
                new NumberOfRectanglesThatCanFormTheLargestSquareLoop();
        assertEquals(expected, loop.countGoodRectangles(rectangles));
    }
}
