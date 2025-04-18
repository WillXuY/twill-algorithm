package leetcode.p0500_0599.p0521_longest_uncommon_subsequence1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestUncommonSubsequence1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", "cdc", 3),
                arguments("aaa", "bbb", 3),
                arguments("aaa", "aaa", -1)
        );
    }

    @ParameterizedTest(name = "Endpoint {index}")
    @MethodSource("dataProvider")
    public void testEndpoint(String a, String b, int expected) {
        LongestUncommonSubsequence1 endpoint =
                new LongestUncommonSubsequence1Endpoint();
        assertEquals(expected, endpoint.findLUSlength(a, b));
    }
}
