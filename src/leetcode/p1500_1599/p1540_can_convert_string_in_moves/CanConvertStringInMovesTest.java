package leetcode.p1500_1599.p1540_can_convert_string_in_moves;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanConvertStringInMovesTest {
    static Stream<Arguments> dataProvider() {
		return Stream.of(
				arguments("input", "ouput", 9, true),
				arguments("abc", "bcd", 10, false),
				arguments("aab", "bbb", 27, true)
		);
	}
    
    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String t, int k, boolean expected) {
    	CanConvertStringInMoves count = new CanConvertStringInMovesCount();
    	assertEquals(expected, count.canConvertString(s, t, k));
    }
}
