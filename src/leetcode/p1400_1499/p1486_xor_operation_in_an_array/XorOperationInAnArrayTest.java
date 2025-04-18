package leetcode.p1400_1499.p1486_xor_operation_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class XorOperationInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 0, 8),
                arguments(4, 3, 8)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int start, int expected) {
        XorOperationInAnArray loop = new XorOperationInAnArrayLoop();
        assertEquals(expected, loop.xorOperation(n, start));
    }
}
