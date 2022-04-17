package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.CountingBitsCycleMulti2;
import org.willxu.algorithm.service.ints.CountingBits;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountingBitsTest {
    static Stream<Arguments> dataProvider() {
        /*
        | number | binary | 1's number |
        |--------+--------+------------|
        |      0 |      0 |          0 |
        |      1 |      1 |          1 |
        |      2 |     10 |          1 |
        |      3 |     11 |          2 |
        |      4 |    100 |          1 |
        |      5 |    101 |          2 |
        |      6 |    110 |          2 |
        |      7 |    111 |          3 |
        |      8 |   1000 |          1 |
        |      9 |   1001 |          2 |
        |     10 |   1010 |          2 |
        |     11 |   1011 |          3 |
        |     12 |   1100 |          2 |
        |     13 |   1101 |          3 |
        |     14 |   1110 |          3 |
        |     15 |   1111 |          4 |
        |     16 |  10000 |          1 |
         */
        return Stream.of(
                arguments(2, new int[] {0, 1, 1}),
                arguments(5, new int[] {0, 1, 1, 2, 1, 2})
        );
    }

    @ParameterizedTest(name = "Cycle multi 2 {index}")
    @MethodSource("dataProvider")
    public void testCycleMulti2(int input, int[] excepted) {
        CountingBits cycleMulti2 = new CountingBitsCycleMulti2();
        assertArrayEquals(excepted, cycleMulti2.countBits(input));
    }
}
