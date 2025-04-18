package leetcode.p1700_1799.p1784_check_if_binary_string_has_at_most_one_segment_of_ones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1", true),
                arguments("1001", false),
                arguments("110", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, boolean expected) {
        CheckIfBinaryStringHasAtMostOneSegmentOfOnes loop =
                new CheckIfBinaryStringHasAtMostOneSegmentOfOnesLoop();
        assertEquals(expected, loop.checkOnesSegment(s));
    }
}
