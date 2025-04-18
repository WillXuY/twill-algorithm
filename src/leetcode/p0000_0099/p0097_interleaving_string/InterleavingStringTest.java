package leetcode.p0000_0099.p0097_interleaving_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class InterleavingStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aabcc", "dbbca", "aadbbcbcac", true),
                arguments("aabcc", "dbbca", "aadbbbaccc", false),
                arguments("", "", "", true),
                arguments("a", "b", "a", false)
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s1, String s2, String s3, boolean excpeted) {
        InterleavingString index = new InterleavingStringIndex();
        assertEquals(excpeted, index.isInterleave(s1, s2, s3));
    }
}
