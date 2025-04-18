package leetcode.p1000_1099.p1009_complement_of_base10_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ComplementOfBase10IntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(0, 1),
                // 00000101 -> 00000010 -> 2
                arguments(5, 2),
                arguments(7, 0),
                arguments(10, 5)
        );
    }

    @ParameterizedTest(name = "Bit {index}")
    @MethodSource("dataProvider")
    public void testBit(int n, int expected) {
        ComplementOfBase10Integer bit = new ComplementOfBase10IntegerBit();
        assertEquals(expected, bit.bitwiseComplement(n));
    }
}
