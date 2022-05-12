package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ThousandSeparatorCharacter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThousandSeparatorTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(123456789, "123.456.789"),
                arguments(1000, "1.000"),
                arguments(987, "987"),
                arguments(1234, "1.234")
        );
    }

    @ParameterizedTest(name = "Character {index}")
    @MethodSource("dataProvider")
    public void testCharacter(int n, String excepted) {
        ThousandSeparator character = new ThousandSeparatorCharacter();
        assertEquals(excepted, character.thousandSeparator(n));
    }
}
