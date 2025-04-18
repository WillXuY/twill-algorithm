package leetcode.p0900_0999.p0932_beautiful_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BeautifulArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(4, new int[] {1, 3, 2, 4}),
                Arguments.arguments(5, new int[] {1, 5, 3, 2, 4})
        );
    }

    @ParameterizedTest(name = "Merge {index}")
    @MethodSource("dataProvider")
    public void testMerge(int n, int[] expected) {
        BeautifulArray merge = new BeautifulArrayMerge();
        assertArrayEquals(expected, merge.beautifulArray(n));
    }
}
