package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ShuffleStringIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShuffleStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "codeleet",
                        new int[] {4, 5, 6, 7, 0, 2, 1, 3},
                        "leetcode"
                ),
                arguments("abc", new int[] {0, 1, 2}, "abc")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s, int[] indices, String excepted) {
        ShuffleString index = new ShuffleStringIndex();
        assertEquals(excepted, index.restoreString(s, indices));
    }
}
