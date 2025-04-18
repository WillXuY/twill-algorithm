package leetcode.p0500_0599.p0507_perfect_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PerfectNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(2016, false),
                // 28 = 1 + 2 + 4 + 7 + 14
                arguments(28, true),
                arguments(6, true),
                arguments(496, true),
                arguments(8128, true),
                arguments(2, false)
        );
    }

    @ParameterizedTest(name = "Division {index}")
    @MethodSource("dataProvider")
    public void testDivision(int input, boolean expected) {
        PerfectNumber division = new PerfectNumberDivision();
        assertEquals(expected, division.checkPerfectNumber(input));
    }
}
