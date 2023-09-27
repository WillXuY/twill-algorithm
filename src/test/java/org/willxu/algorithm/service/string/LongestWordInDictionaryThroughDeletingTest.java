package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LongestWordInDictionaryThroughDeletingMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestWordInDictionaryThroughDeletingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "abpcplea",
                        Stream.of(
                                "ale", "apple", "monkey", "plea"
                        ).collect(Collectors.toList()),
                        "apple"
                ),
                Arguments.arguments(
                        "abpcplea",
                        Stream.of(
                                "a", "b", "c"
                        ).collect(Collectors.toList()),
                        "a"
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String s, List<String> dictionary, String excepted) {
        LongestWordInDictionaryThroughDeleting map =
                new LongestWordInDictionaryThroughDeletingMap();
        assertEquals(excepted, map.findLongestWord(s, dictionary));
    }
}
