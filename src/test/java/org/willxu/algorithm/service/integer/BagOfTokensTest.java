package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.BagOfTokensSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BagOfTokensTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {100}, 50, 0),
                Arguments.arguments(new int[] {200, 100}, 150, 1),
                Arguments.arguments(new int[] {100, 200, 300, 400}, 200, 2)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] tokens, int power, int excepted) {
        BagOfTokens sort = new BagOfTokensSort();
        assertEquals(excepted, sort.bagOfTokensScore(tokens, power));
    }
}
