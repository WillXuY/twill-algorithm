package leetcode.p1800_1899.p1869_longer_contiguous_segments_of_ones_than_zeros;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongerContiguousSegmentsOfOnesThanZerosTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1101", true),
                arguments("111000", false),
                arguments("110100010", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, boolean expected) {
        LongerContiguousSegmentsOfOnesThanZeros count =
                new LongerContiguousSegmentsOfOnesThanZerosCount();
        assertEquals(expected, count.checkZeroOnes(s));
    }
}
