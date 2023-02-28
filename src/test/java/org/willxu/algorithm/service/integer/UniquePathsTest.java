package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.UniquePathsMatrix;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniquePathsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, 7, 28),
                arguments(3, 2, 3)
        );
    }

    @ParameterizedTest(name = "Matrix {index}")
    @MethodSource("dataProvider")
    public void testMatrix(int m, int n, int excepted) {
        UniquePaths matrix = new UniquePathsMatrix();
        assertEquals(excepted, matrix.uniquePaths(m, n));
    }
}
