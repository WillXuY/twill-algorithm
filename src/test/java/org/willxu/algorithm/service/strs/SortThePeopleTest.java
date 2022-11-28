package org.willxu.algorithm.service.strs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strs.SortThePeopleTree;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortThePeopleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"Mary", "John", "Emma"},
                        new int[] {180, 165, 170},
                        new String[] {"Mary", "Emma", "John"}
                ),
                arguments(
                        new String[] {"Alice", "Bob", "Bob"},
                        new int[] {155, 185, 150},
                        new String[] {"Bob", "Alice", "Bob"}
                )
        );
    }

    @ParameterizedTest(name = "Tree {index}")
    @MethodSource("dataProvider")
    public void testTree(String[] names, int[] heights, String[] excepted) {
        SortThePeople tree = new SortThePeopleTree();
        assertArrayEquals(excepted, tree.sortPeople(names, heights));
    }
}
