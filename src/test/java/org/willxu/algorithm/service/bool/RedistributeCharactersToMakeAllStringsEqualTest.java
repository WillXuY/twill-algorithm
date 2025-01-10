package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.RedistributeCharactersToMakeAllStringsEqualCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RedistributeCharactersToMakeAllStringsEqualTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"abc", "aabc", "bc"}, true),
                arguments(new String[] {"ab", "a"}, false)
        );
    }

    /*
    better: use int[] save count which index is char - 'a';
     */
    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String[] words, boolean excepted) {
        RedistributeCharactersToMakeAllStringsEqual count =
                new RedistributeCharactersToMakeAllStringsEqualCount();
        assertEquals(excepted, count.makeEqual(words));
    }
}
