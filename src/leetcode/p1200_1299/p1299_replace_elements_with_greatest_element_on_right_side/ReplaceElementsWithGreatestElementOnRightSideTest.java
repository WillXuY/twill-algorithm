package leetcode.p1200_1299.p1299_replace_elements_with_greatest_element_on_right_side;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReplaceElementsWithGreatestElementOnRightSideTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {17, 18, 5, 4, 6, 1},
                        new int[] {18, 6, 6, 6, 1, -1}
                ),
                arguments(new int[] {400}, new int[] {-1})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int[] expected) {
        ReplaceElementsWithGreatestElementOnRightSide loop
                = new ReplaceElementsWithGreatestElementOnRightSideLoop();
        assertArrayEquals(expected, loop.replaceElements(arr));
    }
}
