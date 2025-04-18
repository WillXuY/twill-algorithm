package leetcode.p0200_0299.p0278_first_bad_version;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FirstBadVersionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                arguments(2, 1),
                arguments(5, 4),
                arguments(1, 1)
        );
    }

    @ParameterizedTest(name = "Golden {index}")
    @MethodSource("dataProvider")
    public void testGolden(int input, int bad) {
        FirstBadVersion golden = new FirstBadVersionGolden();
        golden.setBad(bad);
        assertEquals(bad, golden.firstBadVersion(input));
    }
}
