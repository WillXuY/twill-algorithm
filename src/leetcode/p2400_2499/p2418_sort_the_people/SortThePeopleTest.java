package leetcode.p2400_2499.p2418_sort_the_people;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testTree(String[] names, int[] heights, String[] expected) {
        SortThePeople tree = new SortThePeopleTree();
        assertArrayEquals(expected, tree.sortPeople(names, heights));
    }
}
