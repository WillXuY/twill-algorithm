package leetcode.p0400_0499.p0491_non_decreasing_subsequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonDecreasingSubsequencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {4, 6, 7, 7},
                        Stream.of(
                                Stream.of(
                                        4, 6
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 6, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 6, 7, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 7, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        6, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        6, 7, 7
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        7, 7
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new int[] {4, 4, 3, 2, 1},
                        Stream.of(
                                Stream.of(
                                        4, 4
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, List<List<Integer>> expected) {
        NonDecreasingSubsequences map = new NonDecreasingSubsequencesMap();
        assertEquals(expected, map.findSubsequences(nums));
    }
}
