package leetcode.p1300_1399.p1309_decrypt_string_from_alphabet_to_integer_mapping;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecryptStringFromAlphabetToIntegerMappingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("10#11#12", "jkab"),
                arguments("1326#", "acz")
        );
    }

    @ParameterizedTest(name = "Reverse {index}")
    @MethodSource("dataProvider")
    public void testReverse(String s, String expected) {
        DecryptStringFromAlphabetToIntegerMapping reverse
                = new DecryptStringFromAlphabetToIntegerMappingReverse();
        assertEquals(expected, reverse.freqAlphabets(s));
    }
}
