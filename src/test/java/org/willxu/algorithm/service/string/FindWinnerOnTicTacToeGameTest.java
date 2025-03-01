package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.FindWinnerOnTicTacToeGameLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindWinnerOnTicTacToeGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                1. Forget to check [1, 1] grid.
                o x x
                o x o
                x o x
                 */
                arguments(
                        new int[][] {{0, 2}, {1, 0}, {2, 2}, {1, 2},
                                {2, 0}, {0, 0}, {0, 1}, {2, 1}, {1, 1}},
                        "A"
                ),
                /*
                x
                  x
                o o x
                 */
                arguments(
                        new int[][] {{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}},
                        "A"
                ),
                /*
                x x o
                x o
                o
                 */
                arguments(
                        new int[][] {{0, 0}, {1, 1}, {0, 1}, {0, 2},
                                {1, 0}, {2, 0}},
                        "B"
                ),
                /*
                x x o
                o o x
                x o x
                 */
                arguments(
                        new int[][] {{0, 0}, {1, 1}, {2, 0}, {1, 0},
                                {1, 2}, {2, 1}, {0, 1}, {0, 2}, {2, 2}},
                        "Draw"
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] moves, String expected) {
        FindWinnerOnTicTacToeGame loop = new FindWinnerOnTicTacToeGameLoop();
        assertEquals(expected, loop.tictactoe(moves));
    }
}
