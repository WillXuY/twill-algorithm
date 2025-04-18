package leetcode.p0300_0399.p0378_kth_smallest_element_in_sorted_matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInSortedMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[][] {
                                {1, 5, 9},
                                {10, 11, 13},
                                {12, 13, 15}
                        },
                        8,
                        13
                ),
                Arguments.arguments(new int[][] {{-5}}, 1, -5)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] matrix, int k, int expected) {
        KthSmallestElementInSortedMatrix sort =
                new KthSmallestElementInSortedMatrixSort();
        assertEquals(expected, sort.kthSmallest(matrix, k));
    }
}
