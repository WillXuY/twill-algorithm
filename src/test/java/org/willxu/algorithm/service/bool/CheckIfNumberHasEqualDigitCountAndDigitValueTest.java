package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfNumberHasEqualDigitCountAndDigitValueCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfNumberHasEqualDigitCountAndDigitValueTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1210", true),
                arguments("030", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String num, boolean excepted) {
        CheckIfNumberHasEqualDigitCountAndDigitValue count =
                new CheckIfNumberHasEqualDigitCountAndDigitValueCount();
        assertEquals(excepted, count.digitCount(num));
    }
}
