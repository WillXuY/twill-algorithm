package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindTheTownJudgeSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheTownJudgeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. Only one
                arguments(1, new int[][] {{}}, 1),
                // 1. judge must be trust by n - 1 men.
                arguments(3, new int[][] {{1, 2}, {2, 3}}, -1),
                arguments(2, new int[][] {{1, 2}}, 2),
                arguments(3, new int[][] {{1, 3}, {2, 3}}, 3),
                arguments(3, new int[][] {{1, 3}, {2, 3}, {3, 1}}, -1)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int n, int[][] trust, int expected) {
        FindTheTownJudge set = new FindTheTownJudgeSet();
        assertEquals(expected, set.findJudge(n, trust));
    }
}
