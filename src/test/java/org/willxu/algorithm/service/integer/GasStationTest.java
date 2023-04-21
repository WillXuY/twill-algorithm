package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class GasStationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                 * 1, 2, 3, 4, 5
                 * 3, 4, 5, 1, 2
                 * -2, -2, -2, 3, 3
                 */
                Arguments.arguments(
                        new int[] {1, 2, 3, 4, 5},
                        new int[] {3, 4, 5, 1, 2},
                        3
                ),
                /*
                2, 3, 4
                3, 4, 3
                -1, -1, 1
                 */
                Arguments.arguments(
                        new int[] {2, 3, 4},
                        new int[] {3, 4, 3},
                        -1
                )
        );
    }
}
