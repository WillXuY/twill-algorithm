package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BitwiseAndOfNumbersRangeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 7, 4),
                arguments(0, 0, 0),
                arguments(1, 2147483647, 0)
        );
    }
}
