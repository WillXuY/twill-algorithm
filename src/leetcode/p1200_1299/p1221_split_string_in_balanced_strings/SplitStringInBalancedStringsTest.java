package leetcode.p1200_1299.p1221_split_string_in_balanced_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testStack(String s, int expected) {
        SplitStringInBalancedStrings stack =
                new SplitStringInBalancedStringsStack();
        assertEquals(expected, stack.balancedStringSplit(s));
    }
}
