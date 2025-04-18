package leetcode.p2200_2299.p2248_intersection_of_multiple_arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IntersectionOfMultipleArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {3, 1, 2, 4, 5},
                                {1, 2, 3, 4},
                                {3, 4, 5, 6}
                        },
                        Stream.of(3, 4).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {
                                {1, 2, 3},
                                {4, 5, 6}
                        },
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[][] nums, List<Integer> expected) {
        IntersectionOfMultipleArrays map =
                new IntersectionOfMultipleArraysMap();
        assertEquals(expected, map.intersection(nums));
    }
}
