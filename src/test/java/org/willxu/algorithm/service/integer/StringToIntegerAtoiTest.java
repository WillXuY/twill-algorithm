package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.StringToIntegerAtoiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StringToIntegerAtoiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // lead word.
                arguments("words and 987", 0),
                arguments("12.34", 12),
                arguments("+ 12", 0),
                arguments("12-34-56", 12),
                arguments("42", 42),
                arguments("   -42", -42),
                arguments("4193 with words", 4193)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int excepted) {
        StringToIntegerAtoi loop = new StringToIntegerAtoiLoop();
        assertEquals(excepted, loop.myAtoi(s));
    }
}
