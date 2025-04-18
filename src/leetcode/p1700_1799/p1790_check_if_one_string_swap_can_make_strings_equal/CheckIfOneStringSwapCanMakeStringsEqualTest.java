package leetcode.p1700_1799.p1790_check_if_one_string_swap_can_make_strings_equal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "gasitigykqhrtnypjbeqwwsngclzr",
                        "gasitigykqhrtnypjbeqwwsngczlr",
                        true
                ),
                arguments("bank", "kanb", true),
                arguments("attack", "defend", false),
                arguments("kelb", "kelb", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s1, String s2, boolean expected) {
        CheckIfOneStringSwapCanMakeStringsEqual loop =
                new CheckIfOneStringSwapCanMakeStringsEqualLoop();
        assertEquals(expected, loop.areAlmostEqual(s1, s2));
    }
}
