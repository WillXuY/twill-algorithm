package leetcode.p1300_1399.p1331_rank_transform_of_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RankTransformOfAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. arr.length may be 0.
                arguments(new int[0], new int[0]),
                // 1. save the max rank.
                arguments(
                        new int[] {14, -19, 12, -25, 34, -27, -48, -37, 14, -47,
                                40, 23, 46, -39, 48, -41, 18, -27, -4},
                        new int[] {11, 8, 10, 7, 14, 6, 1, 5, 11, 2,
                                15, 13, 16, 4, 17, 3, 12, 6, 9}
                ),
                arguments(new int[] {40, 10, 20, 30}, new int[] {4, 1, 2, 3}),
                arguments(new int[] {100, 100, 100}, new int[] {1, 1, 1}),
                arguments(
                        new int[] {37, 12, 28, 9, 100, 56, 80, 5, 12},
                        new int[] {5,   3,  4, 2,   8,  6,  7, 1,  3}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] arr, int[] expected) {
        RankTransformOfAnArray map = new RankTransformOfAnArrayMap();
        assertArrayEquals(expected, map.arrayRankTransform(arr));
    }

    /**
     * Time out.
     */
    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] arr, int[] expected) {
        RankTransformOfAnArray pointer = new RankTransformOfAnArrayPointer();
        System.out.println(Arrays.toString(expected));
        System.out.println(Arrays.toString(pointer.arrayRankTransform(arr)));
        assertArrayEquals(expected, pointer.arrayRankTransform(arr));
    }
}
