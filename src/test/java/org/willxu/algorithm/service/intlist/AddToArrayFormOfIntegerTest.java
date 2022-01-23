package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.AddToArrayFormOfIntegerDivide;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AddToArrayFormOfIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 0, 0},
                        34,
                        Stream.of(
                                1, 2, 3, 4
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 7, 4},
                        181,
                        Stream.of(
                                4, 5, 5
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 1, 5},
                        806,
                        Stream.of(
                                1, 0, 2, 1
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int[] num, int k, List<Integer> excepted) {
        AddToArrayFormOfInteger divide = new AddToArrayFormOfIntegerDivide();
        assertArrayEquals(excepted.toArray(),
                divide.addToArrayForm(num, k).toArray());
    }
}
