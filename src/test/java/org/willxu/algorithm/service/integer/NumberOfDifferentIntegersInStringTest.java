package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfDifferentIntegersInStringSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfDifferentIntegersInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("0a0", 1),
                arguments("a123bc34d8ef34", 3),
                arguments("leet1234code234", 2),
                arguments("a1b01c001", 1)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String word, int excepted) {
        NumberOfDifferentIntegersInString set =
                new NumberOfDifferentIntegersInStringSet();
        assertEquals(excepted, set.numDifferentIntegers(word));
    }
}
