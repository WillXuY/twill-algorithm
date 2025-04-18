package leetcode.p1500_1599.p1502_can_make_arithmetic_progression_from_sequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanMakeArithmeticProgressionFromSequenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 5, 1}, true),
                arguments(new int[] {1, 2, 4}, false)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] arr, boolean expected) {
        CanMakeArithmeticProgressionFromSequence sort =
                new CanMakeArithmeticProgressionFromSequenceSort();
        assertEquals(expected, sort.canMakeArithmeticProgression(arr));
    }
}
