package leetcode.p1300_1399.p1323_maximum69_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Maximum69NumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(9669, 9969),
                arguments(9996, 9999),
                arguments(9999, 9999)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int num, int expected) {
        Maximum69Number divide = new Maximum69NumberDivide();
        assertEquals(expected, divide.maximum69Number(num));
    }
}
