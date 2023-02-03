package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CombinationSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 3, 6, 7}, 7,
                        Stream.of(
                                Stream.of(
                                        2, 2, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        7
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 3, 5}, 8,
                        Stream.of(
                                Stream.of(
                                        2, 2, 2, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 3, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 5
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(new int[] {2}, 1, Collections.emptyList())
        );
    }
}
