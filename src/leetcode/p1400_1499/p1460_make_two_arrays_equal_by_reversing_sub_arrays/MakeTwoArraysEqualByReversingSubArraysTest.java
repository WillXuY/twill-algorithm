package leetcode.p1400_1499.p1460_make_two_arrays_equal_by_reversing_sub_arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeTwoArraysEqualByReversingSubArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3}, true),
                arguments(new int[] {7}, new int[] {7}, true),
                arguments(new int[] {3, 7, 9}, new int[] {3, 7, 11}, false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] target, int[] arr, boolean expected) {
        MakeTwoArraysEqualByReversingSubArrays map =
                new MakeTwoArraysEqualByReversingSubArraysMap();
        assertEquals(expected, map.canBeEqual(target, arr));
    }
}
