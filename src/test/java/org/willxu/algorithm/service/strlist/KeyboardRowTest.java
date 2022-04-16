package org.willxu.algorithm.service.strlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.KeyboardRowCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KeyboardRowTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"Hello", "Alaska", "Dad", "Peace"},
                        new String[] {"Alaska", "Dad"}
                ),
                arguments(
                        new String[] {"omk"},
                        new String[0]
                ),
                arguments(
                        new String[] {"adsdf", "sfd"},
                        new String[] {"adsdf", "sfd"}
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String[] input, String[] excepted) {
        KeyboardRow count = new KeyboardRowCount();
        assertArrayEquals(excepted, count.findWords(input));
    }
}
