package org.willxu.algorithm.service.bool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.PowerOfThreeEnumeration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PowerOfThreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // wrong answer3: -3, -3 cannot be power of 3
                arguments(-3, false),
                // wrong answer2: 1162261467 not generator in all.
                arguments(1162261467, true),
                // wrong answer1: 1 is 3^0
                arguments(1, true),
                arguments(27, true),
                arguments(0, false),
                arguments(9, true),
                arguments(45, false)
        );
    }

    @ParameterizedTest(name = "Enumeration {index}")
    @MethodSource("dataProvider")
    public void testEnumeration(int input, boolean excepted) {
        PowerOfThree enumeration = new PowerOfThreeEnumeration();
        assertEquals(excepted, enumeration.isPowerOfThree(input));
    }

    @Test
    public void listAllThePowerOfThree() {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (i <= Integer.MAX_VALUE / 3) {
            list.add(i);
            i *= 3;
        }
        list.add(i);
        System.out.println(list);
    }
}
