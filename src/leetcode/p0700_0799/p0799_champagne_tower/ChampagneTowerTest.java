package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ChampagneTowerArray;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampagneTowerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(1, 1, 1, 0.0),
                Arguments.arguments(2, 1, 1, 0.5),
                Arguments.arguments(100000009, 33, 17, 1.0)
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(int poured, int query_row, int query_glass,
                          double expected) {
        ChampagneTower array = new ChampagneTowerArray();
        assertEquals(expected, array.champagneTower(
                poured, query_row, query_glass));
    }
}
