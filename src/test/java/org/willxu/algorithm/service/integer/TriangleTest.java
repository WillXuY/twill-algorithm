package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.TriangleList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        Stream.of(
                                Stream.of(2).collect(Collectors.toList()),
                                Stream.of(3, 4).collect(Collectors.toList()),
                                Stream.of(6, 5, 7).collect(Collectors.toList()),
                                Stream.of(4, 1, 8, 3).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        11
                ),
                Arguments.arguments(
                        Stream.of(
                                Stream.of(-10).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        -10
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(List<List<Integer>> triangle, int expected) {
        Triangle list = new TriangleList();
        assertEquals(expected, list.minimumTotal(triangle));
    }
}
