package leetcode.p0400_0499.p0496_next_greater_element1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NextGreaterElement1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation: The next greater element for each value of
                nums1 is as follows:
                - 4 is marked in nums2 = [1, 3, <4>, 2]. There is no
                    next greater element, so the answer is -1.
                - 1 is marked in nums2 = [<1>, 3, 4, 2]. The next
                    greater element is 3.
                - 2 is marked in nums2 = [1, 3, 4, <2>]. There is no
                    next greater element, so the answer is -1.
                 */
                arguments(
                        new int[] {4, 1, 2},
                        new int[] {1, 3, 4, 2},
                        new int[] {-1, 3, -1}
                ),
                arguments(
                        new int[] {2, 4},
                        new int[] {1, 2, 3, 4},
                        new int[] {3, -1}
                )
        );
    }

    @ParameterizedTest(name = "Set Index {index}")
    @MethodSource("dataProvider")
    public void testSetIndex(int[] nums1, int[] nums2, int[] expected) {
        NextGreaterElement1 setIndex = new NextGreaterElement1SetIndex();
        assertArrayEquals(expected, setIndex.nextGreaterElement(nums1, nums2));
    }
}
