package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.SubsetsIiRecursive;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubsetsIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 2},
                        Stream.of(
                                Collections.emptyList(),
                                Stream.of(1).collect(Collectors.toList()),
                                Stream.of(1, 2).collect(Collectors.toList()),
                                Stream.of(1, 2, 2).collect(Collectors.toList()),
                                Stream.of(2).collect(Collectors.toList()),
                                Stream.of(2, 2).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0},
                        Stream.of(
                                Collections.emptyList(),
                                Stream.of(0).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, List<List<Integer>> excepted) {
        SubsetsIi recursive = new SubsetsIiRecursive();
        Set<List<Integer>> exceptedSet = new HashSet<>(excepted);
        Set<List<Integer>> outputSet = new HashSet<>(
                recursive.subsetsWithDup(nums));
        assertEquals(exceptedSet, outputSet);
    }
}
