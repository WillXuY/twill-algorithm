package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LongestUncommonSubsequence1Endpoint;

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
    public void testEndpoint(String a, String b, int excepted) {
        LongestUncommonSubsequence1 endpoint =
                new LongestUncommonSubsequence1Endpoint();
        assertEquals(excepted, endpoint.findLUSlength(a, b));
    }
}
