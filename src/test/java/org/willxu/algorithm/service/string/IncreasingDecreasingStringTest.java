package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.IncreasingDecreasingStringTreeMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IncreasingDecreasingStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaaabbbbcccc", "abccbaabccba"),
                arguments("rat", "art")
        );
    }

    @ParameterizedTest(name = "TreeMap {index}")
    @MethodSource("dataProvider")
    public void testTreeMap(String s, String excepted) {
        IncreasingDecreasingString treeMap
                = new IncreasingDecreasingStringTreeMap();
        assertEquals(excepted, treeMap.sortString(s));
    }
}
