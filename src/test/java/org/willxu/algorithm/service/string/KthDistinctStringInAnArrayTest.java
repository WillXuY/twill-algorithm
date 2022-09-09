package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.KthDistinctStringInAnArrayList;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KthDistinctStringInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"d","b","c","b","c","a"}, 2, "a"),
                arguments(new String[] {"aaa", "aa", "a"}, 1, "aaa"),
                arguments(new String[] {"a", "b", "a"}, 3, "")
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(String[] arr, int k, String excepted) {
        KthDistinctStringInAnArray list = new KthDistinctStringInAnArrayList();
        assertEquals(excepted, list.kthDistinct(arr, k));
    }
}
