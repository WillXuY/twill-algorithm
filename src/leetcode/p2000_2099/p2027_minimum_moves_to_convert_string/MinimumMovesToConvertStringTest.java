package leetcode.p2000_2099.p2027_minimum_moves_to_convert_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumMovesToConvertStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("XXX", 1),
                arguments("XXOX", 2),
                arguments("OOOO", 0)
        );
    }

    @ParameterizedTest(name = "Skip {index}")
    @MethodSource("dataProvider")
    public void testSkip(String s, int expected) {
        MinimumMovesToConvertString skip =
                new MinimumMovesToConvertStringSkip();
        assertEquals(expected, skip.minimumMoves(s));
    }
}
