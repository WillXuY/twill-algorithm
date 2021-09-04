package org.willxu.algorithm.service.bool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ValidPerfectSquareDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPerfectSquareTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // wrong answer 1
                Arguments.arguments(2147395600, true),
                Arguments.arguments(16, true),
                Arguments.arguments(14, false)
        );
    }

    @ParameterizedTest(name = "Enumerate {index}")
    @MethodSource("dataProvider")
    public void testEnumerate(int input, boolean excepted) {
        ValidPerfectSquare enumerate = new ValidPerfectSquareDifference();
        assertEquals(excepted, enumerate.isPerfectSquare(input));
    }

    @Test
    public void getAllPerfectSquare() {
        int maxRoot = (int) Math.sqrt(Integer.MAX_VALUE);
        List<Integer> perfectSquareList = new ArrayList<>();
        for (int i = 1; i <= maxRoot; i++) {
            perfectSquareList.add(i * i);
        }
        System.out.println(perfectSquareList);
        int maxDiff = 2147395600 - 2147302921;
        // 92679;
        System.out.println(maxDiff);
    }
}
