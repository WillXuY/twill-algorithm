package leetcode.p1500_1599.p1560_most_visited_sector_in_circular_track;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MostVisitedSectorInCircularTrackTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        3,
                        new int[] {3, 2, 1, 2, 1, 3, 2, 1, 2, 1, 3, 2, 3, 1},
                        Stream.of(1, 3).collect(Collectors.toList())
                ),
                arguments(
                        4,
                        new int[] {1, 3, 1, 2},
                        Stream.of(1, 2).collect(Collectors.toList())
                ),
                arguments(
                        2,
                        new int[] {2, 1, 2, 1, 2, 1, 2, 1, 2},
                        Stream.of(2).collect(Collectors.toList())
                ),
                arguments(
                        7,
                        new int[] {1, 3, 5, 7},
                        Stream.of(
                                1, 2, 3, 4, 5, 6, 7
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Endpoint {index}")
    @MethodSource("dataProvider")
    public void testEndpoint(int n, int[] rounds, List<Integer> expected) {
        MostVisitedSectorInCircularTrack endpoint =
                new MostVisitedSectorInCircularTrackEndpoint();
        assertArrayEquals(expected.toArray(),
                endpoint.mostVisited(n, rounds).toArray());
    }
}
