package leetcode.p0400_0499.p0486_predict_the_winner;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PredictTheWinnerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 5, 2}, false),
                Arguments.arguments(new int[] {1, 5, 233, 7}, true)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, boolean expected) {
        PredictTheWinner recursive = new PredictTheWinnerRecursive();
        assertEquals(expected, recursive.predictTheWinner(nums));
    }
}
