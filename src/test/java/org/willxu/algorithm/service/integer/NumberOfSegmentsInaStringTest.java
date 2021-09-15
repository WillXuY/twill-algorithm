package org.willxu.algorithm.service.integer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfSegmentsInaStringSpace;

import java.util.stream.Stream;

public class NumberOfSegmentsInaStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Misleading description
                Arguments.arguments("           ", 0),
                Arguments.arguments("Hello, my name is John", 5),
                Arguments.arguments("Hello", 1),
                Arguments.arguments("love live! mu'sic forever", 4),
                Arguments.arguments("", 0)
        );
    }

    @ParameterizedTest(name = "Space {index}")
    @MethodSource("dataProvider")
    public void testSpace(String input, int excepted) {
        NumberOfSegmentsInaString space = new NumberOfSegmentsInaStringSpace();
        Assertions.assertEquals(excepted, space.countSegments(input));
    }
}
