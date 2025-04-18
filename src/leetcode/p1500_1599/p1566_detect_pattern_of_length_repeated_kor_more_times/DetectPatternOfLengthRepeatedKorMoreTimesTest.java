package leetcode.p1500_1599.p1566_detect_pattern_of_length_repeated_kor_more_times;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetectPatternOfLengthRepeatedKorMoreTimesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // consecutive sub-sequence
                arguments(new int[] {1, 2, 3, 1, 2}, 2, 2, false),
                arguments(new int[] {1, 2, 4, 4, 4, 4}, 1, 3, true),
                arguments(new int[] {1, 2, 1, 2, 1, 1, 1, 3}, 2, 2, true),
                arguments(new int[] {1, 2, 1, 2, 1, 3}, 2, 3, false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int m, int k, boolean expected) {
        DetectPatternOfLengthRepeatedKorMoreTimes count =
                new DetectPatternOfLengthRepeatedKorMoreTimesCount();
        assertEquals(expected, count.containsPattern(arr, m, k));
    }
}
