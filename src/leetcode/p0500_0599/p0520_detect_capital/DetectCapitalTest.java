package leetcode.p0500_0599.p0520_detect_capital;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetectCapitalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                arguments("FFFFFFFFFFFFFFFFFFFFf", false),
                arguments("USA", true),
                arguments("FlaG", false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String input, boolean expected) {
        DetectCapital loop = new DetectCapitalLoop();
        assertEquals(expected, loop.detectCapitalUse(input));
    }
}
