package leetcode.p2200_2299.p2269_find_the_beauty_of_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheBeautyOfNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(240, 2, 2),
                arguments(430043, 2, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int num, int k, int expected) {
        FindTheBeautyOfNumber loop = new FindTheBeautyOfNumberLoop();
        assertEquals(expected, loop.divisorSubstrings(num, k));
    }
}
