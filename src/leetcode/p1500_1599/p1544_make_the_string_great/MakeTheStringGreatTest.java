package leetcode.p1500_1599.p1544_make_the_string_great;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeTheStringGreatTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("leEeetcode", "leetcode"),
                arguments("abBAcC", ""),
                arguments("s", "s")
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String s, String expected) {
        MakeTheStringGreat stack = new MakeTheStringGreatStack();
        assertEquals(expected, stack.makeGood(s));
    }
}
