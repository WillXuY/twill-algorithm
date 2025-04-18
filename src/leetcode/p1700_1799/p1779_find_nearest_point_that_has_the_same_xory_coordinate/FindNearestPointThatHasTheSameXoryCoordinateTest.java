package leetcode.p1700_1799.p1779_find_nearest_point_that_has_the_same_xory_coordinate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindNearestPointThatHasTheSameXoryCoordinateTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        3,
                        4,
                        new int[][] {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}},
                        2
                ),
                arguments(3, 4, new int[][] {{3, 4}}, 0),
                arguments(3, 4, new int[][] {{2, 3}}, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int x, int y, int[][] points, int expected) {
        FindNearestPointThatHasTheSameXoryCoordinate loop =
                new FindNearestPointThatHasTheSameXoryCoordinateLoop();
        assertEquals(expected, loop.nearestValidPoint(x, y, points));
    }
}
