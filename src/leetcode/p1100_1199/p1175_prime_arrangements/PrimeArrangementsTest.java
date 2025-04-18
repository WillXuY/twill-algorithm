package leetcode.p1100_1199.p1175_prime_arrangements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PrimeArrangementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                 1, 2, 3, 4, 5
                 x, v, v, x, v
                 2 * 1 * 3 * 2 * 1
                 */
                arguments(5, 12),
                arguments(100, 682289015)
        );
    }

    @ParameterizedTest(name = "Sift {index}")
    @MethodSource("dataProvider")
    public void testSift(int n, int expected) {
        PrimeArrangements sift = new PrimeArrangementsSift();
        assertEquals(expected, sift.numPrimeArrangements(n));
    }
}
