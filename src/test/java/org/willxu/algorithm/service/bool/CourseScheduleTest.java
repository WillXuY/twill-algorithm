package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class CourseScheduleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(2, new int[][] {{1, 0}}, true),
                Arguments.arguments(2, new int[][] {{1, 0}, {0, 1}}, false)
        );
    }
}
