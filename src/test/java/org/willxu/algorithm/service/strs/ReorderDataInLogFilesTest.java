package org.willxu.algorithm.service.strs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strs.ReorderDataInLogFilesSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReorderDataInLogFilesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. add ' ' compare and add '!' as first letter token.
                arguments(
                        new String[] {
                                "dig1 8 1 5 1",
                                "let1 art zero can",
                                "dig2 3 6",
                                "let2 own kit dig",
                                "let3 art zero"
                        },
                        new String[] {
                                "let3 art zero",
                                "let1 art zero can",
                                "let2 own kit dig",
                                "dig1 8 1 5 1",
                                "dig2 3 6"
                        }
                ),
                // 1: two logs' end string are same.
                arguments(
                        new String[] {
                                "a1 9 2 3 1",
                                "g1 act car",
                                "zo4 4 7",
                                "ab1 off key dog",
                                "a8 act zoo",
                                "a2 act car"
                        },
                        new String[] {
                                "a2 act car",
                                "g1 act car",
                                "a8 act zoo",
                                "ab1 off key dog",
                                "a1 9 2 3 1",
                                "zo4 4 7"
                        }
                ),
                arguments(
                        new String[] {
                                "dig1 8 1 5 1",
                                "let1 art can",
                                "dig2 3 6",
                                "let2 own kit dig",
                                "let3 art zero"
                        },
                        new String[] {
                                "let1 art can",
                                "let3 art zero",
                                "let2 own kit dig",
                                "dig1 8 1 5 1",
                                "dig2 3 6"
                        }
                ),
                arguments(
                        new String[] {
                                "a1 9 2 3 1",
                                "g1 act car",
                                "zo4 4 7",
                                "ab1 off key dog",
                                "a8 act zoo"
                        },
                        new String[] {
                                "g1 act car",
                                "a8 act zoo",
                                "ab1 off key dog",
                                "a1 9 2 3 1",
                                "zo4 4 7"
                        }
                )
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String[] logs, String[] expected) {
        ReorderDataInLogFiles split = new ReorderDataInLogFilesSplit();
        assertArrayEquals(expected, split.reorderLogFiles(logs));
    }
}
