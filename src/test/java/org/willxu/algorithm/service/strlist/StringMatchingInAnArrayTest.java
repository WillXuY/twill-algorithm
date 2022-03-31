package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.StringMatchingInAnArrayContains;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StringMatchingInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"mass", "as", "hero", "superhero"},
                        Stream.of("as", "hero").collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"leetcode", "et", "code"},
                        Stream.of("et", "code").collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"blue", "green", "bu"},
                        Collections.emptyList()
                )
        );
    }

    @ParameterizedTest(name = "Contains {index}")
    @MethodSource("dataProvider")
    public void testContains(String[] words, List<String> excepted) {
        StringMatchingInAnArray contains =
                new StringMatchingInAnArrayContains();
        assertArrayEquals(excepted.toArray(),
                contains.stringMatching(words).toArray());
    }
}
