package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindTheBeautyOfNumberLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheBeautyOfNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(240, 2, 2),
                arguments(430043, 2, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int num, int k, int excepted) {
        FindTheBeautyOfNumber loop = new FindTheBeautyOfNumberLoop();
        assertEquals(excepted, loop.divisorSubstrings(num, k));
    }
}
