package leetcode.p1000_1099.p1025_divisior_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p1000_1099.p1025_divisior_game.DivisorGameParity;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DivisiorGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(2, true),
                // A 1: n = 2; B 1: n = 1
                arguments(3, false)
        );
    }

    @ParameterizedTest(name = "Parity {index}")
    @MethodSource("dataProvider")
    public void testParity(int n, boolean expected) {
        DivisorGame parity = new DivisorGameParity();
        assertEquals(expected, parity.divisorGame(n));
    }
}
