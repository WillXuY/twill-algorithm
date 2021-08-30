package org.willxu.algorithm.service.bool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.PowerOfFourEnumerate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PowerOfFourTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(16, true),
                arguments(5, false),
                arguments(1, true)
        );
    }

    @ParameterizedTest(name = "Enumerate {index}")
    @MethodSource("dataProvider")
    public void testEnumerate(int input, boolean excepted) {
        PowerOfFour enumerate = new PowerOfFourEnumerate();
        assertEquals(excepted, enumerate.isPowerOfFour(input));
    }

    @Test
    public void enumeratePowerOf4() {
        List<Integer> powerList = new ArrayList<>();
        int power = 1;
        while (power < Integer.MAX_VALUE / 4) {
            powerList.add(power);
            power *= 4;
        }
        // 1073741824
        powerList.add(power);
        System.out.println(powerList);
    }
}
