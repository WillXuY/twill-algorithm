package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FirstUniqueCharacterInaStringRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstUniqueCharacterInaStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("dddccdbba", 8),
                Arguments.arguments("leetcode", 0),
                Arguments.arguments("loveleetcode", 2),
                Arguments.arguments("aabb", -1)
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String input, int expected) {
        FirstUniqueCharacterInaString remove =
                new FirstUniqueCharacterInaStringRemove();
        assertEquals(expected, remove.firstUniqChar(input));
    }
}
