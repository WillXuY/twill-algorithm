package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class EditDistanceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("horse", "ros", 3),
                Arguments.arguments("intention", "execution", 5)
        );
    }
}
