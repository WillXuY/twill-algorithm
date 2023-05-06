package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CompareVersionNumbersSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("1.01", "1.001", 0),
                Arguments.arguments("1.0", "1.0.0", 0),
                Arguments.arguments("0.1", "1.1", -1)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String version1, String version2, int excepted) {
        CompareVersionNumbers split = new CompareVersionNumbersSplit();
        assertEquals(excepted, split.compareVersion(version1, version2));
    }
}
