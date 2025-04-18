package leetcode.p0300_0399.p0345_reverse_vowels_ofa_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseVowelsOfaStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("hello", "holle"),
                Arguments.arguments("leetcode", "leotcede")
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(String input, String expected) {
        ReverseVowelsOfaString pointer = new ReverseVowelsOfaStringPointer();
        assertEquals(expected, pointer.reverseVowels(input));
    }
}
