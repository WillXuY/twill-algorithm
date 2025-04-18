package leetcode.p0400_0499.p0415_add_strings;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 2 split start with leading 0
                Arguments.arguments(
                        "3876620623801494171",
                        "6529364523802684779",
                        "10405985147604178950"
                ),
                // Wrong answer 1
                Arguments.arguments("123456789", "987654321", "1111111110"),
                Arguments.arguments("11", "123", "134"),
                Arguments.arguments("456", "77", "533"),
                Arguments.arguments("0", "0", "0")
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String num1, String num2, String expected) {
        AddStrings split = new AddStringsSplit();
        assertEquals(expected, split.addStrings(num1, num2));
    }
}
