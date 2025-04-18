package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.RearrangeCharactersToMakeTargetStringCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RearrangeCharactersToMakeTargetStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("ilovecodingonleetcode", "code", 2),
                arguments("abcba", "abc", 1),
                arguments("abbaccaddaeea", "aaaaa", 1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String target, int expected) {
        RearrangeCharactersToMakeTargetString count =
                new RearrangeCharactersToMakeTargetStringCount();
        assertEquals(expected, count.rearrangeCharacters(s, target));
    }
}
