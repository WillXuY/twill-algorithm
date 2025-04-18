package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumBitFlipsToConvertNumberBit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumBitFlipsToConvertNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(10, 7, 3),
                arguments(3, 4, 3)
        );
    }

    @ParameterizedTest(name = "Bit {index}")
    @MethodSource("dataProvider")
    public void testBit(int start, int goal, int expected) {
        MinimumBitFlipsToConvertNumber bit =
                new MinimumBitFlipsToConvertNumberBit();
        assertEquals(expected, bit.minBitFlips(start, goal));
    }
}
