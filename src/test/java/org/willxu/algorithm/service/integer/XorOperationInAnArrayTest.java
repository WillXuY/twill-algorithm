package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.XorOperationInAnArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class XorOperationInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 0, 8),
                arguments(4, 3, 8)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int start, int excepted) {
        XorOperationInAnArray loop = new XorOperationInAnArrayLoop();
        assertEquals(excepted, loop.xorOperation(n, start));
    }
}
