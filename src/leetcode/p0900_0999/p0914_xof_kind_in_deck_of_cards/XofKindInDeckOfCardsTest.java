package leetcode.p0900_0999.p0914_xof_kind_in_deck_of_cards;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p0900_0999.p0914_xof_kind_in_deck_of_cards.XofKingInDeckOfCardsMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class XofKindInDeckOfCardsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 4: iterator remove elements.
                arguments(new int[] {0, 0, 0, 0, 1, 1, 1, 2, 3, 4}, false),
                // 3: greatest common divisor > 1
                arguments(new int[] {1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, true),
                // 2: Can split 2*1, 2*2, 2*2
                arguments(new int[] {1, 1, 2, 2, 2, 2}, true),
                // Wrong answer 1: X >= 2
                arguments(new int[] {1}, false),
                arguments(new int[] {1, 2, 3, 4, 4, 3, 2, 1}, true),
                arguments(new int[] {1, 1, 1, 2, 2, 2, 3, 3}, false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] deck, boolean expected) {
        XofKingInDeckOfCards map = new XofKingInDeckOfCardsMap();
        assertEquals(expected, map.hasGroupsSizeX(deck));
    }
}
