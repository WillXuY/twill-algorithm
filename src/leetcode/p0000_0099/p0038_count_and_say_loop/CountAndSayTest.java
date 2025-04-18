package leetcode.p0000_0099.p0038_count_and_say_loop;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountAndSayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, "1"),
                arguments(2, "11"),
                arguments(3, "21"),
                arguments(4, "1211")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, String expected) {
        CountAndSay loop = new CountAndSayLoop();
        assertEquals(expected, loop.countAndSay(n));
    }
}
