package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.BeautifulArrayMerge;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BeautifulArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(4, new int[] {1, 3, 2, 4}),
                Arguments.arguments(5, new int[] {1, 5, 3, 2, 4})
        );
    }

    @ParameterizedTest(name = "Merge {index}")
    @MethodSource("dataProvider")
    public void testMerge(int n, int[] excepted) {
        BeautifulArray merge = new BeautifulArrayMerge();
        assertArrayEquals(excepted, merge.beautifulArray(n));
    }
}
