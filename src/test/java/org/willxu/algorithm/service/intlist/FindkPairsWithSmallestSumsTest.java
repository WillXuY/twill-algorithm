package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindkPairsWithSmallestSumsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {1, 7, 11},
                        new int[] {2, 4, 6},
                        3,
                        Stream.of(
                                Stream.of(1, 2).collect(Collectors.toList()),
                                Stream.of(1, 4).collect(Collectors.toList()),
                                Stream.of(1, 6).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new int[] {1, 1, 2},
                        new int[] {1, 2, 3},
                        2,
                        Stream.of(
                                Stream.of(1, 1).collect(Collectors.toList()),
                                Stream.of(1, 1).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        new int[] {1, 2},
                        new int[] {3},
                        2,
                        Stream.of(
                                Stream.of(1, 3).collect(Collectors.toList()),
                                Stream.of(2, 3).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }
}
