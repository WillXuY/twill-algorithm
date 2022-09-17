package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.Finding3DigitEvenNumbersPick;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Finding3DigitEvenNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 1, 3, 0},
                        new int[] {102,120,130,132,210,230,302,310,312,320}
                ),
                arguments(
                        new int[] {2, 2, 8, 8, 2},
                        new int[] {222,228,282,288,822,828,882}
                ),
                arguments(
                        new int[] {3, 7, 5},
                        new int[] {}
                )
        );
    }

    @ParameterizedTest(name = "Pick {index}")
    @MethodSource("dataProvider")
    public void testPick(int[] digits, int[] excepted) {
        Finding3DigitEvenNumbers pick = new Finding3DigitEvenNumbersPick();
        assertArrayEquals(excepted, pick.findEvenNumbers(digits));
    }
}
