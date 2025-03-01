package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.GenerateStringWithCharactersThatHaveOddCountsFill;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GenerateStringWithCharactersThatHaveOddCountsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, "baaa"),
                arguments(2, "ba")
        );
    }

    @ParameterizedTest(name = "Fill {index}")
    @MethodSource("dataProvider")
    public void testFill(int n, String expected) {
        GenerateStringWithCharactersThatHaveOddCounts fill
                = new GenerateStringWithCharactersThatHaveOddCountsFill();
        assertEquals(expected, fill.generateTheString(n));
    }
}
