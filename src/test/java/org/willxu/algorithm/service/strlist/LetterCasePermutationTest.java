package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.LetterCasePermutationLoop;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCasePermutationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "a1b2",
                        Stream.of(
                                "a1b2", "a1B2", "A1b2", "A1B2"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        "3z4",
                        Stream.of(
                                "3z4", "3Z4"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, List<String> excepted) {
        LetterCasePermutation loop = new LetterCasePermutationLoop();
        assertEquals(new HashSet<>(excepted),
                new HashSet<>(loop.letterCasePermutation(s)));
    }
}
