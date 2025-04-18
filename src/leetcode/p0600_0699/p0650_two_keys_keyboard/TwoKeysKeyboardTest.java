package leetcode.p0600_0699.p0650_two_keys_keyboard;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoKeysKeyboardTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(3, 3),
                Arguments.arguments(1, 0),
                Arguments.arguments(6, 5),
                Arguments.arguments(9, 6)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int n, int expected) {
        TwoKeysKeyboard divide = new TwoKeysKeyboardDivide();
        assertEquals(expected, divide.minSteps(n));
    }
}
