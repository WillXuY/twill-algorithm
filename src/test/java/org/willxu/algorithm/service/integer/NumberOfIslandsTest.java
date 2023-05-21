package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class NumberOfIslandsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new char[][] {
                                {'1','1','1','1','0'},
                                {'1','1','0','1','0'},
                                {'1','1','0','0','0'},
                                {'0','0','0','0','0'}
                        },
                        1
                ),
                Arguments.arguments(
                        new char[][] {
                                {'1','1','0','0','0'},
                                {'1','1','0','0','0'},
                                {'0','0','1','0','0'},
                                {'0','0','0','1','1'}
                        },
                        3
                )

        );
    }
}
