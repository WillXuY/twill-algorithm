package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.FindCommonCharactersCompare;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindCommonCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"bella", "label", "roller"},
                        Stream.of(
                                "e", "l", "l"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"cool", "lock", "cook"},
                        Stream.of(
                                "c", "o"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(String[] words, List<String> excepted) {
        FindCommonCharacters compare = new FindCommonCharactersCompare();
        assertArrayEquals(excepted.toArray(),
                compare.commonChars(words).toArray());
    }
}
