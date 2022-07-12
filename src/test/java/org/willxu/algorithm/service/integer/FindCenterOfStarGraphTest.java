package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindCenterOfStarGraphEqual;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testEqual(int[][] edges, int excepted) {
        FindCenterOfStarGraph equal = new FindCenterOfStarGraphEqual();
        assertEquals(excepted, equal.findCenter(edges));
    }
}
