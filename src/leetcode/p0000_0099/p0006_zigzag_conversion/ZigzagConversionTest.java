package leetcode.p0000_0099.p0006_zigzag_conversion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ZigzagConversionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                 * P   A   H   N
                 * A P L S I I G
                 * Y   I   R
                 */
                arguments("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                /*
                 * P     I    N
                 * A   L S  I G
                 * Y A   H R
                 * P     I
                 */
                arguments("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                arguments("A", 1, "A")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s, int numRows, String expected) {
        ZigzagConversion index = new ZigzagConversionIndex();
        assertEquals(expected, index.convert(s, numRows));
    }
}
