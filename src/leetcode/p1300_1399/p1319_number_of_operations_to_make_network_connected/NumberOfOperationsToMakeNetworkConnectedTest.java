package leetcode.p1300_1399.p1319_number_of_operations_to_make_network_connected;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfOperationsToMakeNetworkConnectedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        12,
                        new int[][] {
                                {1,5},{1,7},{1,2},{1,4},{3,7},{4,7},
                                {3,5},{0,6},{0,1},{0,4},{2,6},{0,3},
                                {0,2}
                        },
                        4
                ),
                arguments(
                        4,
                        new int[][] {{0, 1}, {0, 2}, {1, 2}},
                        1
                ),
                arguments(
                        6,
                        new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}},
                        2
                ),
                arguments(
                        6,
                        new int[][] {{0, 1}, {0, 2}, {0, 3}, {1, 2}},
                        -1
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int n, int[][] connections, int expected) {
        NumberOfOperationsToMakeNetworkConnected count =
                new NumberOfOperationsToMakeNetworkConnectedCount();
        assertEquals(expected, count.makeConnected(n, connections));
    }
}
