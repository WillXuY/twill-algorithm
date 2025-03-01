package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ShortestDistanceToTargetStringInCircularArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShortestDistanceToTargetStringInCircularArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"hello", "i", "am", "leetcode", "hello"},
                        "hello",
                        1,
                        1
                ),
                arguments(
                        new String[] {"a", "b", "leetcode"},
                        "leetcode",
                        0,
                        1
                ),
                arguments(new String[] {"i", "eat", "leetcode"}, "ate", 0, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(
            String[] words, String target, int startIndex, int expected) {
        ShortestDistanceToTargetStringInCircularArray loop =
                new ShortestDistanceToTargetStringInCircularArrayLoop();
        assertEquals(expected, loop.closetTarget(words, target, startIndex));
    }
}
