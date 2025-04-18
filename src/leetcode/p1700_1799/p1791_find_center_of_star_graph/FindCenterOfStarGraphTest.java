package leetcode.p1700_1799.p1791_find_center_of_star_graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindCenterOfStarGraphTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2}, {2, 3}, {4, 2}}, 2),
                arguments(new int[][] {{1, 2}, {5, 1}, {1, 3}, {1, 4}}, 1)
        );
    }

    @ParameterizedTest(name = "Equal {index}")
    @MethodSource("dataProvider")
    public void testEqual(int[][] edges, int expected) {
        FindCenterOfStarGraph equal = new FindCenterOfStarGraphEqual();
        assertEquals(expected, equal.findCenter(edges));
    }
}
