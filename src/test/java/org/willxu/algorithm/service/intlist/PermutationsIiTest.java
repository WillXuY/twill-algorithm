package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PermutationsIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 1, 2},
                        Stream.of(
                                Stream.of(
                                        1, 1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        1, 2, 1
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 1, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {1, 2, 3},
                        Stream.of(
                                Stream.of(
                                        1, 2, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        1, 3, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 1, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        2, 3, 1
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 2, 1
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }
}
