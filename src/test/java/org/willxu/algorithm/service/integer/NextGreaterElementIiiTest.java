package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NextGreaterElementIiiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextGreaterElementIiiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(12, 21),
                Arguments.arguments(21, -1),
                Arguments.arguments(230241, 230412)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int excepted) {
        NextGreaterElementIii loop = new NextGreaterElementIiiLoop();
        assertEquals(excepted, loop.nextGreaterElement(n));
    }
}
