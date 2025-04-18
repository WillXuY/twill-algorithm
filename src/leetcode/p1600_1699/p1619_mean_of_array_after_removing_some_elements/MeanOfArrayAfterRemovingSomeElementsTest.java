package leetcode.p1600_1699.p1619_mean_of_array_after_removing_some_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MeanOfArrayAfterRemovingSomeElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3},
                        2.0
                ),
                arguments(
                        new int[] {6,2,7,5,1,2,0,3,10,2,5,0,5,5,0,8,7,6,8,0},
                        4,0
                ),
                arguments(
                        new int[] {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,
                                8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4},
                        4.777777777777778
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] arr, double expected) {
        MeanOfArrayAfterRemovingSomeElements sort =
                new MeanOfArrayAfterRemovingSomeElementsSort();
        assertEquals(expected, sort.trimMean(arr));
    }
}
