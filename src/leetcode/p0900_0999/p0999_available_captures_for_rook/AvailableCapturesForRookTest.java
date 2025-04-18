package leetcode.p0900_0999.p0999_available_captures_for_rook;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AvailableCapturesForRookTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new char[][] {
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','R','.','.','.','p'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'}
                        },
                        3
                ),
                arguments(
                        new char[][] {
                                {'.','.','.','.','.','.','.','.'},
                                {'.','p','p','p','p','p','.','.'},
                                {'.','p','p','B','p','p','.','.'},
                                {'.','p','B','R','B','p','.','.'},
                                {'.','p','p','B','p','p','.','.'},
                                {'.','p','p','p','p','p','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'}
                        },
                        0
                ),
                arguments(
                        new char[][] {
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'p','p','.','R','.','p','B','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','B','.','.','.','.'},
                                {'.','.','.','p','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'}
                        },
                        3
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(char[][] board, int expected) {
        AvailableCapturesForRook loop = new AvailableCapturesForRookLoop();
        assertEquals(expected, loop.numRookCaptures(board));
    }
}
