package leetcode.p0500_0599.p0504_base7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Base7Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(100, "202"),
                arguments(-7, "-10")
        );
    }

    @ParameterizedTest(name = "Division {index}")
    @MethodSource("dataProvider")
    public void testDivision(int input, String expected) {
        Base7 division = new Base7Division();
        assertEquals(expected, division.convertToBase7(input));
    }
}
