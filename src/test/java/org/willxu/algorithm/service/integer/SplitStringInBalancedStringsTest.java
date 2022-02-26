package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SplitStringInBalancedStringsStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SplitStringInBalancedStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // RL RRLL RL RL
                arguments("RLRRLLRLRL", 4),
                // RL LLLRRR LR
                arguments("RLLLLRRRLR", 3),
                arguments("LLLLRRRR", 1)
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String s, int excepted) {
        SplitStringInBalancedStrings stack =
                new SplitStringInBalancedStringsStack();
        assertEquals(excepted, stack.balancedStringSplit(s));
    }
}
