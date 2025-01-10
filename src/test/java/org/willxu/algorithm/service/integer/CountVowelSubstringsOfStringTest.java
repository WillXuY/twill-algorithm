package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountVowelSubstringsOfStringCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountVowelSubstringsOfStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aeiouu", 2),
                arguments("unicornarihan", 0),
                arguments("cuaieuouac", 7)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String word, int excepted) {
        CountVowelSubstringsOfString count =
                new CountVowelSubstringsOfStringCount();
        assertEquals(excepted, count.countVowelSubstrings(word));
    }
}
