package leetcode.p1600_1699.p1694_reformat_phone_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReformatPhoneNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("123 4-5678", "123-456-78"),
                arguments("1-23-45 6", "123-456"),
                arguments("123 4-567", "123-45-67")
        );
    }

    @ParameterizedTest(name = "Remainder {index}")
    @MethodSource("dataProvider")
    public void testRemainder(String number, String expected) {
        ReformatPhoneNumber remainder = new ReformatPhoneNumberRemainder();
        assertEquals(expected, remainder.reformatNumber(number));
    }
}
