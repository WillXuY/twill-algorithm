package leetcode.p2200_2299.p2235_add_two_integers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AddTwoIntegersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(12, 5, 17),
                arguments(-10, 4, -6)
        );
    }

    @ParameterizedTest(name = "Add {index}")
    @MethodSource("dataProvider")
    public void testAdd(int num1, int num2, int expected) {
        AddTwoIntegers add = new AddTwoIntegersAdd();
        assertEquals(expected, add.sum(num1, num2));
    }
}
