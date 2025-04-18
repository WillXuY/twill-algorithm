package leetcode.p0900_0999.p0941_valid_mountain_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidMountainArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Can't be same between two element.
                arguments(new int[] {1, 1, 1, 1, 1, 1, 1, 2, 1}, false),
                arguments(new int[] {2, 1}, false),
                arguments(new int[] {3, 5, 5}, false),
                arguments(new int[] {0, 3, 2, 1}, true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, boolean expected) {
        ValidMountainArray loop = new ValidMountainArrayLoop();
        assertEquals(expected, loop.validMountainArray(arr));
    }
}
