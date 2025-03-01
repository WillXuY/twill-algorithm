package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.FairCandySwapOrder;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FairCandySwapTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2},
                        new int[] {2, 3},
                        new int[] {1, 2}
                ),
                arguments(
                        new int[] {2},
                        new int[] {1, 3},
                        new int[] {2, 3}
                ),
                arguments(
                        new int[] {1, 2, 5},
                        new int[] {2, 4},
                        new int[] {5, 4}
                )
        );
    }

    @ParameterizedTest(name = "Order {index}")
    @MethodSource("dataProvider")
    public void testOrder(int[] alice, int[] bob, int[] expected) {
        FairCandySwap order = new FairCandySwapOrder();
        assertArrayEquals(expected, order.fairCandySwap(alice, bob));
    }
}
