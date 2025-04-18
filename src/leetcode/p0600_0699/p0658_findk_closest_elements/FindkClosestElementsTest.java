package leetcode.p0600_0699.p0658_findk_closest_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindkClosestElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {0, 1, 1, 1, 2, 3, 6, 7, 8, 9},
                        9, 4,
                        Stream.of(
                                0, 1, 1, 1, 2, 3, 6, 7, 8
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new int[] {1, 2, 3, 4, 5},
                        4, 3,
                        Stream.of(
                                1, 2, 3, 4
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new int[] {1, 2, 3, 4, 5},
                        4, -1,
                        Stream.of(
                                1, 2, 3, 4
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] arr, int k, int x, List<Integer> expected) {
        FindkClosestElements map = new FindkClosestElementsMap();
        assertEquals(expected, map.findClosestElements(arr, k, x));
    }
}
