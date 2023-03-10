package org.willxu.algorithm.service.bool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.WordSearchLoop;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WordSearchTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Need deep copy.
                 */
                arguments(
                        new char[][]{
                                {'C', 'A', 'A'},
                                {'A', 'A', 'A'},
                                {'B', 'C', 'D'}
                        },
                        "AAB", true
                ),
                arguments(new char[][] {{'a'}}, "a", true),
                arguments(
                        new char[][] {
                                {'A', 'B', 'C', 'E'},
                                {'S', 'F', 'C', 'S'},
                                {'A', 'D', 'E', 'E'}
                        },
                        "ABCCED", true
                ),
                arguments(
                        new char[][] {
                                {'A', 'B', 'C', 'E'},
                                {'S', 'F', 'C', 'S'},
                                {'A', 'D', 'E', 'E'}
                        },
                        "SEE", true
                ),
                arguments(
                        new char[][] {
                                {'A', 'B', 'C', 'E'},
                                {'S', 'F', 'C', 'S'},
                                {'A', 'D', 'E', 'E'}
                        },
                        "ABCB", false
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(char[][] board, String word, boolean excepted) {
        WordSearch loop = new WordSearchLoop();
        assertEquals(excepted, loop.exist(board, word));
    }

    @Test
    public void testSetIntegerArray() {
        int[] array1 = new int[] {1, 2};
        int[] array2 = new int[] {1, 2};
        Set<int[]> set = new HashSet<>();
        set.add(array1);
        assertFalse(set.contains(array2));
    }
}
