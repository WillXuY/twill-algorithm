package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumNumberOfBalloonsCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfBalloonsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("nlaebolko", 1),
                arguments("loonbalxballpoon", 2),
                arguments("leetcode", 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String text, int excepted) {
        MaximumNumberOfBalloons count = new MaximumNumberOfBalloonsCount();
        assertEquals(excepted, count.maxNumberOfBalloons(text));
    }
}
