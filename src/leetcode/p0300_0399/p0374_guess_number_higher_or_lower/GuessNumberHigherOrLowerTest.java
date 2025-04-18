package leetcode.p0300_0399.p0374_guess_number_higher_or_lower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // unknown wrong 1: Misleading description.
                Arguments.arguments(4, 3),
                // time out
                Arguments.arguments(3, 1),
                Arguments.arguments(10, 6),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(2, 2)
        );
    }

    @ParameterizedTest(name = "Golden {index}")
    @MethodSource("dataProvider")
    public void testGolden(int max, int expected) {
        AbstractGuessNumberHigherOrLower golden
                = new GuessNumberHigherOrLowerGolden(expected);
        assertEquals(expected, golden.guessNumber(max));
    }
}
