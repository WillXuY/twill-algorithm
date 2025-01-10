package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.BestPokerHandCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestPokerHandTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {13, 2, 3, 1, 9},
                        new char[] {'a', 'a', 'a', 'a', 'a'},
                        BestPokerHand.FLUSH
                ),
                arguments(
                        new int[] {4, 4, 2, 4, 4},
                        new char[] {'d', 'a', 'a', 'b', 'c'},
                        BestPokerHand.THREE
                ),
                arguments(
                        new int[] {10, 10, 2, 12, 9},
                        new char[] {'a', 'b', 'c', 'a', 'd'},
                        BestPokerHand.PAIR
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] ranks, char[] suits, String excepted) {
        BestPokerHand count = new BestPokerHandCount();
        assertEquals(excepted, count.bestHand(ranks, suits));
    }
}
