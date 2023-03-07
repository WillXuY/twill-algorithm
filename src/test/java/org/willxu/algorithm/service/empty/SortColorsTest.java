package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.empty.SortColorsExchange;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortColorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {
                                2,2,1,2,1,1,1,0,0,2,1,0,2,1,2,2,1,1,1,1,
                                1,0,2,0,2,0,2,2,1,0,2,1,0,2,1,2,0,0,0,0,
                                2,1,1,2,0,1,2,2,0,0,2,2,0,1,0,1,0,0,1,1,
                                1,0,0,2,2,2,1,0,0,2,1,0,1,0,2,2,1,2,1,1,
                                2,1,1,0,0,2,1,0,0
                        },
                        new int[] {
                                0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,
                                1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                                2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,
                                2,2,2,2,2,2,2,2,2
                        }
                ),
                arguments(
                        new int[] {2, 2, 0, 0, 2, 0, 2, 1, 0},
                        new int[] {0, 0, 0, 0, 1, 2, 2, 2, 2}
                ),
                arguments(new int[] {1, 2, 0, 0}, new int[] {0, 0, 1, 2}),
                arguments(
                        new int[] {0, 2, 2, 2, 0, 2, 1, 1},
                        new int[] {0, 0, 1, 1, 2, 2, 2, 2}
                ),
                arguments(new int[] {2, 1, 2}, new int[] {1, 2, 2}),
                arguments(new int[] {1, 2, 0}, new int[] {0, 1, 2}),
                arguments(new int[] {2}, new int[] {2}),
                arguments(
                        new int[] {2, 0, 2, 1, 1, 0},
                        new int[] {0, 0, 1, 1, 2, 2}
                ),
                arguments(new int[] {2, 0, 1}, new int[] {0, 1, 2})
        );
    }

    @ParameterizedTest(name = "Exchange {index}")
    @MethodSource("dataProvider")
    public void testExchange(int[] nums, int[] excepted) {
        SortColors exchange = new SortColorsExchange();
        exchange.sortColors(nums);
        assertArrayEquals(excepted, nums);
    }
}
