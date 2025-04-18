package leetcode.p0100_0199.p0165_compare_version_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompareVersionNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("1.01", "1.001", 0),
                Arguments.arguments("1.0", "1.0.0", 0),
                Arguments.arguments("0.1", "1.1", -1)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String version1, String version2, int expected) {
        CompareVersionNumbers split = new CompareVersionNumbersSplit();
        assertEquals(expected, split.compareVersion(version1, version2));
    }
}
