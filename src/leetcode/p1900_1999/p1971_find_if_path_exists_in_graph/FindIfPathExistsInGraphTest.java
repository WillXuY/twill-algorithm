package leetcode.p1900_1999.p1971_find_if_path_exists_in_graph;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindIfPathExistsInGraphTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        10,
                        new int[][] {
                                {4, 3}, {1, 4}, {4, 8}, {1, 7}, {6, 4},
                                {4, 2}, {7, 4}, {4, 0}, {0, 9}, {5, 4}
                        },
                        5, 9, true
                ),
                arguments(
                        10,
                        new int[][] {
                                {0, 7}, {0, 8}, {6, 1}, {2, 0}, {0, 4},
                                {5, 8}, {4, 7}, {1, 3}, {3, 5}, {6, 5}
                        },
                        7, 5, true
                ),
                arguments(
                        6,
                        new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}},
                        0, 5, false
                ),
                arguments(1, new int[][] {{}}, 0, 0, true),
                arguments(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}, 0, 2, true),
                arguments(
                        6,
                        new int[][] {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}},
                        0, 5, false
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int[][] edges,
                         int source, int destination, boolean expected) {
        FindIfPathExistsInGraph loop = new FindIfPathExistsInGraphLoop();
        assertEquals(expected, loop.validPath(n, edges, source, destination));
    }
}
