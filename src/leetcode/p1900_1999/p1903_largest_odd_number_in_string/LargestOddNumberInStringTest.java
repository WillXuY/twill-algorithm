package leetcode.p1900_1999.p1903_largest_odd_number_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestOddNumberInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("52", "5"),
                arguments("4206", ""),
                arguments("35427", "35427")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String num, String expected) {
        LargestOddNumberInString index = new LargestOddNumberInStringIndex();
        assertEquals(expected, index.largestOddNumber(num));
    }
}
