package leetcode.p0000_0099.p0091_decode_ways;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecodeWaysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("12", 2),
                arguments("226", 3),
                arguments("06", 0)
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(String s, int expected) {
        DecodeWays array = new DecodeWaysArray();
        assertEquals(expected, array.numDecodings(s));
    }

    /**
     * Time Limit Exceeded
     */
    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(String s, int expected) {
        DecodeWays recursive = new DecodeWaysRecursive();
        assertEquals(expected, recursive.numDecodings(s));
    }
}
