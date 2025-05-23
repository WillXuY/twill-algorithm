package leetcode.p0300_0399.p0347_topk_frequent_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopkFrequentElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {1, 1, 1, 2, 2, 3},
                        2,
                        new int[] {1, 2}
                ),
                Arguments.arguments(new int[] {1}, 1, new int[] {1})
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, int k, int[] expected) {
        TopkFrequentElements map = new TopkFrequentElementsMap();
        assertArrayEquals(expected, map.topKFrequent(nums, k));
    }
}
