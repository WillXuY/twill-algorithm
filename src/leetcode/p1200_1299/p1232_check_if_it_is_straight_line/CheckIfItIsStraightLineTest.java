package leetcode.p1200_1299.p1232_check_if_it_is_straight_line;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfItIsStraightLineTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}
                        }, true
                ),
                arguments(
                        new int[][] {
                                {1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}
                        }, false
                )
        );
    }

    @ParameterizedTest(name = "Equation {index}")
    @MethodSource("dataProvider")
    public void testEquation(int[][] coordinates, boolean expected) {
        CheckIfItIsStraightLine equation =
                new CheckIfItIsStraightLineEquation();
        assertEquals(expected, equation.checkStraightLine(coordinates));
    }
}
