package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.GreatestEnglishLetterInUpperAndLowerCaseSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("lEeTcOdE", "E"),
                arguments("arRAzFif", "R"),
                arguments("AbCdEfGhIjK", "")
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, String excepted) {
        GreatestEnglishLetterInUpperAndLowerCase set =
                new GreatestEnglishLetterInUpperAndLowerCaseSet();
        assertEquals(excepted, set.greatestLetter(s));
    }
}
