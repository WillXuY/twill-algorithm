package leetcode.p2100_2199.p2124_check_if_all_as_appears_before_all_bs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllAsAppearsBeforeAllBsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaabbb", true),
                arguments("abab", false),
                arguments("bbb", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, boolean expected) {
        CheckIfAllAsAppearsBeforeAllBs loop =
                new CheckIfAllAsAppearsBeforeAllBsLoop();
        assertEquals(expected, loop.checkString(s));
    }
}
