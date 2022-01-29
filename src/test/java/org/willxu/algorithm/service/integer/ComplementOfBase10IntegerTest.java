package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ComplementOfBase10IntegerBit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ComplementOfBase10IntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(0, 1),
                // 00000101 -> 00000010 -> 2
                arguments(5, 2),
                arguments(7, 0),
                arguments(10, 5)
        );
    }

    @ParameterizedTest(name = "Bit {index}")
    @MethodSource("dataProvider")
    public void testBit(int n, int excepted) {
        ComplementOfBase10Integer bit = new ComplementOfBase10IntegerBit();
        assertEquals(excepted, bit.bitwiseComplement(n));
    }
}
