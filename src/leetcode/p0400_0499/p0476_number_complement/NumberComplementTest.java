package leetcode.p0400_0499.p0476_number_complement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberComplementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 2),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Dividing {index}")
    @MethodSource("dataProvider")
    public void testDividing(int input, int expected) {
        NumberComplement dividing = new NumberComplementDividing();
        assertEquals(expected, dividing.findComplement(input));
    }
}
