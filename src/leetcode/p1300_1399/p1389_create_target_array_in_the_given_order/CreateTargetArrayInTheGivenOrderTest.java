package leetcode.p1300_1399.p1389_create_target_array_in_the_given_order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CreateTargetArrayInTheGivenOrderTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {0, 1, 2, 3, 4},
                        new int[] {0, 1, 2, 2, 1},
                        new int[] {0, 4, 1, 3, 2}
                ),
                arguments(
                        new int[] {1, 2, 3, 4, 0},
                        new int[] {0, 1, 2, 3, 0},
                        new int[] {0, 1, 2, 3, 4}
                ),
                arguments(
                        new int[] {1},
                        new int[] {0},
                        new int[] {1}
                )
        );
    }

    @ParameterizedTest(name = "Copy {index}")
    @MethodSource("dataProvider")
    public void testCopy(int[] nums, int[] index, int[] expected) {
        CreateTargetArrayInTheGivenOrder copy
                = new CreateTargetArrayInTheGivenOrderCopy();
        assertArrayEquals(expected, copy.createTargetArray(nums, index));
    }
}
