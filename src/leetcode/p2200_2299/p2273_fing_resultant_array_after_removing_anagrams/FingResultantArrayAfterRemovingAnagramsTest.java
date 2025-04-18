package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p2200_2299.p2273_fing_resultant_array_after_removing_anagrams.FindResultantArrayAfterRemovingAnagramsSort;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FingResultantArrayAfterRemovingAnagramsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"a","b","a"},
                        Stream.of("a","b","a").collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"abba","baba","bbaa","cd","cd"},
                        Stream.of("abba","cd").collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"a","b","c","d","e"},
                        Stream.of(
                                "a","b","c","d","e"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(String[] words, List<String> expected) {
        FindResultantArrayAfterRemovingAnagrams sort =
                new FindResultantArrayAfterRemovingAnagramsSort();
        assertArrayEquals(expected.toArray(),
                sort.removeAnagrams(words).toArray());
    }
}
