package leetcode.p1300_1399.p1313_decompress_run_length_encoded_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecompressRunLengthEncodedListTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4}, new int[] {2, 4, 4, 4}),
                arguments(new int[] {1, 1, 2, 3}, new int[] {1, 3, 3})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        DecompressRunLengthEncodedList loop =
                new DecompressRunLengthEncodedListLoop();
        assertArrayEquals(expected, loop.decompressRLElist(nums));
    }
}
